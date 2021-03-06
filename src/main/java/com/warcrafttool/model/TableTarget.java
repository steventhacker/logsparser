package com.warcrafttool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Table target
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TableTarget
{
	private String name;
	private Long total;
	private Object type;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Long getTotal()
	{
		return total;
	}

	public void setTotal(Long total)
	{
		this.total = total;
	}

	public Object getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
}
