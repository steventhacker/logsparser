package com.warcrafttool.service;

import com.warcrafttool.model.FightGroup;
import com.warcrafttool.model.Report;
import com.warcrafttool.model.ReportTable;
import com.warcrafttool.model.Zone;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Interface to retrieve logs from the WarcraftLogs API
 */
@Component
public interface LogsService
{
	//--------------------------------------------------------------------
	/**
	 * Retrieve a list of reports for a specific guild on a specific realm. This currently returns all reports
	 * uploaded for the lifetime of the guild's records on WarcraftLogs
	 * @param guildName name of guild being requested
	 * @param serverName name of server the guild is on, in dash format (i.e. twisting-nether)
	 * @param regionName name of region server is in
	 * @param apiKey user's specific API key
	 * @return List of Reports
	 */
	List<Report> getReportsForGuild(String guildName, String serverName, String regionName, String apiKey);

	/**
	 * Retrieve the details of a raid report. Includes bosses fought and participants
	 * @param reportID id of report being requested
	 * @param start (optional) start time
	 * @param end (optional) end time
	 * @return FightGroup
	 */
	FightGroup getFightsForReport(@PathVariable("code") String reportID,
									@RequestParam("start") Long start,
									@RequestParam("end") Long end
	);

	/**
	 *
	 * @param type type of data being requested, such as damage-done or healing
	 * @param reportID ID of report being requested
	 * @param start (optional) start time
	 * @param end (optional) end time
	 * @param sourceId (optional) ID of character to focus
	 * @param encounterID (optional) ID of encounter to focus
	 * @return
	 */
	ReportTable getTablesForReport(
			@PathVariable("type") String type,
			@PathVariable("code") String reportID,
			@RequestParam(value = "start", required = false) Long start,
			@RequestParam(value = "end", required = false) Long end,
			@RequestParam("sourceid") Long sourceId,
			@RequestParam(value = "encounterID", required = false) Long encounterID
	);

	List<Zone> getZones();
}
