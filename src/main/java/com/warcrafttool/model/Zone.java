package com.warcrafttool.model;

import java.util.List;

/**
 * Zone model
 */
public class Zone
{
	private Integer id;
	private String name;
	private Boolean frozen;
	private List<Encounter> encounters;
	private List<Bracket> brackets;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Boolean getFrozen()
	{
		return frozen;
	}

	public void setFrozen(Boolean frozen)
	{
		this.frozen = frozen;
	}

	public List<Encounter> getEncounters()
	{
		return encounters;
	}

	public void setEncounters(List<Encounter> encounters)
	{
		this.encounters = encounters;
	}

	public List<Bracket> getBrackets()
	{
		return brackets;
	}

	public void setBrackets(List<Bracket> brackets)
	{
		this.brackets = brackets;
	}
}
