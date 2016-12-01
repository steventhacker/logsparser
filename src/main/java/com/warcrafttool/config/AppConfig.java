package com.warcrafttool.config;

import com.warcrafttool.IndexController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
