package com.warcrafttool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Enemy model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Enemy
{
	private String name;
	private String type;
	private Long id;
	private Long guid;
	private List<FightAppearance> fights = new ArrayList<FightAppearance>();

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getGuid()
	{
		return guid;
	}

	public void setGuid(Long guid)
	{
		this.guid = guid;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public List<FightAppearance> getFights()
	{
		return fights;
	}

	public void setFights(List<FightAppearance> fights)
	{
		this.fights = fights;
	}

}
