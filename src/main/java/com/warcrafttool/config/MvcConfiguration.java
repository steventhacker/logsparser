package com.warcrafttool.config;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import com.warcrafttool.helpers.HandlebarsHelpers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "com.warcrafttool.config")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter
{
	//--------------------------------------------------------------------
	@Bean
	public HandlebarsViewResolver getViewResolver()
	{
		HandlebarsViewResolver resolver = new HandlebarsViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".hbs");
		resolver.setCache(false);
		resolver.registerHelpers(HandlebarsHelpers.class);
		return resolver;
	}

	//--------------------------------------------------------------------
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
	{
		configurer.enable();
	}
}