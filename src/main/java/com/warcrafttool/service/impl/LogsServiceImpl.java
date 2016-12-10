package com.warcrafttool.service.impl;

import com.warcrafttool.model.FightGroup;
import com.warcrafttool.model.ReportTable;
import com.warcrafttool.model.Zone;
import com.warcrafttool.util.URLMappings;
import com.warcrafttool.model.Report;
import com.warcrafttool.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Implementation of LogsService interface
 */
@Component
public class LogsServiceImpl implements LogsService
{
	//====================================================================
	// public methods
	//====================================================================

	//--------------------------------------------------------------------
	@Override
	public List<Report> getReportsForGuild(String guildName, String serverName, String regionName, String apiKey)
	{
		setApiKey(apiKey);

		String url = String.format(URLMappings.API_BASE + URLMappings.GET_REPORTS_FOR_GUILD, guildName, serverName, regionName);

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("api_key", apiKey);

		HttpEntity<?> entity = new HttpEntity<>(headers);

		ResponseEntity<List<Report>> reportList = restTemplate.exchange(
				builder.build().encode().toUri(),
				HttpMethod.GET,
				entity,
				new ParameterizedTypeReference<List<Report>>(){});

		List<Report> reports = reportList.getBody();
		if (reports != null)
		{
			return reports;
		}
		return null;
	}

	@Override
	public FightGroup getFightsForReport(@PathVariable("code") String reportID,
										 @RequestParam("start") Long start,
										 @RequestParam("end") Long end)
	{
		if (apiKey == null)
		{
			return null;
		}

		String url = String.format(URLMappings.API_BASE + URLMappings.GET_FIGHTS_FOR_REPORT, reportID);

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("api_key", apiKey);

		HttpEntity<?> entity = new HttpEntity<>(headers);

		ResponseEntity<FightGroup> reportList = restTemplate.exchange(
				builder.build().encode().toUri(),
				HttpMethod.GET,
				entity,
				new ParameterizedTypeReference<FightGroup>(){});

		FightGroup fightGroup = reportList.getBody();
		if (fightGroup != null)
		{
			return fightGroup;
		}
		return null;
	}

	@Override
	public ReportTable getTablesForReport(@PathVariable("type") String type,
										  @PathVariable("code") String reportID,
										  @RequestParam(value = "start", required = false) Long start,
										  @RequestParam(value = "end", required = false) Long end,
										  @RequestParam("sourceid") Long sourceId,
										  @RequestParam(value = "encounterID", required = false) Long encounterID)
	{
		if (apiKey == null)
		{
			return null;
		}

		String url = String.format(URLMappings.API_BASE + URLMappings.GET_TABLES_FOR_REPORT, type, reportID);

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("api_key", apiKey)
				.queryParam("sourceid", sourceId)
				.queryParam("encounterid", encounterID)
				.queryParam("start", start != null ? start : 0)
				.queryParam("end", end != null ? end : 0);

		HttpEntity<?> entity = new HttpEntity<>(headers);

		ResponseEntity<ReportTable> reportList = restTemplate.exchange(
				builder.build().encode().toUri(),
				HttpMethod.GET,
				entity,
				new ParameterizedTypeReference<ReportTable>(){});

		ReportTable reportTable = reportList.getBody();
		if (reportTable != null)
		{
			return reportTable;
		}
		return null;
	}

	public List<Zone> getZones()
	{
		if (apiKey == null)
		{
			return null;
		}

		String url = String.format(URLMappings.API_BASE + URLMappings.GET_ZONES);

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("api_key", apiKey);

		HttpEntity<?> entity = new HttpEntity<>(headers);

		ResponseEntity<List<Zone>> reportList = restTemplate.exchange(
				builder.build().encode().toUri(),
				HttpMethod.GET,
				entity,
				new ParameterizedTypeReference<List<Zone>>(){});

		List<Zone> zones = reportList.getBody();
		if (zones != null)
		{
			return zones;
		}
		return null;
	}

	private void setApiKey(String key)
	{
		this.apiKey = key;
	}


	//====================================================================
	// private data
	//====================================================================

	@Autowired
	private RestTemplate restTemplate;

	private String apiKey;
}
