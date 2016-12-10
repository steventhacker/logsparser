package com.warcrafttool.controller;

import com.warcrafttool.model.Encounter;
import com.warcrafttool.model.Fight;
import com.warcrafttool.model.FightGroup;
import com.warcrafttool.model.Report;
import com.warcrafttool.model.ReportTable;
import com.warcrafttool.model.ReportTableEntry;
import com.warcrafttool.model.ViewMap;
import com.warcrafttool.model.Zone;
import com.warcrafttool.service.LogsService;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Controller to handle guild reports
 */
@Controller
public class ReportsController
{
	//--------------------------------------------------------------------
	@RequestMapping(value = "/reports", method = RequestMethod.POST)
	public String getReports(Model model,
							 @RequestParam("guild-name") String guildName,
							 @RequestParam("server-name") String serverName,
							 @RequestParam("region-name") String regionName,
							 @RequestParam("key-name") String apiKey)
	{
		try
		{
			List<Report> reports = logsService.getReportsForGuild(guildName, serverName, regionName, apiKey);

			// Sort list by descending time
			Collections.reverse(reports);

			model.addAttribute("reports", reports);
		}
		catch (Exception ex)
		{
			LOGGER.warn(String.format("Unable to retrieve guild report data for guild %s on %s", guildName, serverName), ex);
		}

		return "reports";
	}

	@RequestMapping(value = "/report", method = RequestMethod.GET)
	public String getReport(Model model, @RequestParam("report") String report)
	{
		FightGroup fightGroup = logsService.getFightsForReport(report, null, null);

		List<Zone> zones = logsService.getZones();

		List<ViewMap> bossMap = new ArrayList<>();
		for (Fight fight : fightGroup.getFights())
		{
			String name = "";
			if (fight.getDifficulty() == 4)
			{
				name += "H ";
			}
			name += fight.getName();
			if (fight.getBossPercentage() > 0)
			{
				name += " (wipe)";
			}

			String id = "";

			for (Zone zone : zones)
			{
				if (Long.valueOf(zone.getId()).equals(fightGroup.getZone()))
				{
					for (Encounter encounter : zone.getEncounters())
					{
						if (encounter.getName().equals(fight.getName()))
						{
							id = String.valueOf(encounter.getId());
						}
					}
				}
			}

			bossMap.add(new ViewMap(id, name));
		}

		List<ViewMap> participantMap = fightGroup.getFriendlies()
				.stream()
				.map(friendly -> new ViewMap(String.valueOf(friendly.getId()), friendly.getName()))
				.collect(Collectors.toList());

		model.addAttribute("bosses", bossMap);
		model.addAttribute("friendlies", participantMap);
		model.addAttribute("report", report);

		return "report";
	}

	@RequestMapping(value = "/table", method = RequestMethod.POST)
	public String getTable(Model model,
						   @RequestParam("type") String type,
						   @RequestParam("report") String report,
						   @RequestParam("sourceId") Long sourceId,
						   @RequestParam(value = "encounterId", required = false) Long encounterId)
	{
		ReportTable table = logsService.getTablesForReport(type, report, null, 1481086223422L, sourceId, encounterId);

		// Add up total
		table.getEntries().stream().filter(entry -> entry.getTotal() > 0).forEach(entry ->
		{
			table.addToTotal(entry.getTotal());
		});

		// Remove any values with a total of 0, don't care about that info
		Iterator<ReportTableEntry> entryIterator = table.getEntries().iterator();
		while (entryIterator.hasNext())
		{
			if (entryIterator.next().getTotal() == 0)
			{
				entryIterator.remove();
			}
		}

		model.addAttribute("type", type.replaceAll("-", " "));
		model.addAttribute("table", table);

		return "table";
	}

	//====================================================================
	// private data
	//====================================================================

	@Autowired
	private static final XLogger LOGGER = XLoggerFactory.getXLogger(IndexController.class);

	@Autowired
	private LogsService logsService;
}
