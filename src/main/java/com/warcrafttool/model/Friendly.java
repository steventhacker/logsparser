package com.warcrafttool.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Friendly model
 */
public class Friendly
{

	private String name;
	private Long id;
	private Long guid;
	private String type;
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
