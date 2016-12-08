package com.warcrafttool.service.impl;

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

	//====================================================================
	// private data
	//====================================================================

	@Autowired
	private RestTemplate restTemplate;
}
