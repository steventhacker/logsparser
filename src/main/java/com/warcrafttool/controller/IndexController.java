package com.warcrafttool.controller;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController
{
	//--------------------------------------------------------------------
	@RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
	public String getIndex(Model model)
	{
		return "index";
	}

	//====================================================================
	// private data
	//====================================================================

	@Autowired
	private static final XLogger LOGGER = XLoggerFactory.getXLogger(IndexController.class);

	@Autowired
	private RestTemplate restTemplate;
}
