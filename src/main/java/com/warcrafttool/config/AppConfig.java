package com.warcrafttool.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.warcrafttool.controller.IndexController;
import com.warcrafttool.controller.ReportsController;
import com.warcrafttool.service.LogsService;
import com.warcrafttool.service.impl.LogsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Steve on 11/30/2016.
 */
@Configuration
public class AppConfig
{
	@Bean
	public IndexController indexController()
	{
		return new IndexController();
	}

	@Bean
	public ReportsController reportsController()
	{
		return new ReportsController();
	}

	@Bean
	public LogsService logsService()
	{
		return new LogsServiceImpl();
	}

	@Bean
	public RestTemplate restTemplate()
	{
		RestTemplate restTemplate = new RestTemplate();

		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setObjectMapper(new ObjectMapper());
		converter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON));

		List<HttpMessageConverter<?>> converters = new ArrayList<>();
		converters.add(converter);

		restTemplate.setMessageConverters(converters);

		return restTemplate;
	}
}
