package com.warcrafttool.service;

import com.warcrafttool.model.Report;
import org.springframework.stereotype.Component;

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
}
