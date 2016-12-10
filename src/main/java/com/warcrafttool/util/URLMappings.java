package com.warcrafttool.util;

/**
 * util for WarcraftLogs endpoint mappings
 */
public class URLMappings
{
	public static final String API_BASE = "https://www.warcraftlogs.com:443/v1";
	public static final String GET_REPORTS_FOR_GUILD = "/reports/guild/%s/%s/%s";
	public static final String GET_FIGHTS_FOR_REPORT = "/report/fights/%s";
	public static final String GET_TABLES_FOR_REPORT = "/report/tables/%s/%s";
	public static final String GET_ZONES = "/zones";
}
