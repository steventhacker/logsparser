package com.warcrafttool.controller;

import com.warcrafttool.model.Report;
import com.warcrafttool.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Controller to handle guild reports
 */
@Controller
public class ReportsController
{
	//--------------------------------------------------------------------
	@RequestMapping(value = {"/reports"}, method = RequestMethod.POST)
	public String getReports(Model model,
							 @RequestParam("guild-name") String guildName,
							 @RequestParam("server-name") String serverName,
							 @RequestParam("region-name") String regionName,
							 @RequestParam("key-name") String apiKey)
	{

		List<Report> reports = logsService.getReportsForGuild(guildName, serverName, regionName, apiKey);

		model.addAttribute("reports", reports);

		return "reports";
	}

	@Autowired
	private LogsService logsService;
}
