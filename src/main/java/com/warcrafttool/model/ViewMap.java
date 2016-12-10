package com.warcrafttool.model;

/**
 * Simple wrapper for maps that handlebars can process
 */
public class ViewMap
{
	public ViewMap(String id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public String getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	private String id;
	private String name;
}
