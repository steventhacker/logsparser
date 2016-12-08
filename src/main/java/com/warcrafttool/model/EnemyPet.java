package com.warcrafttool.model;

import java.util.ArrayList;
import java.util.List;

/**
 * EnemyPet model
 */
public class EnemyPet
{
	private String name;
	private String type;
	private Long id;
	private Long guid;
	private Long petOwner;
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

	public Long getPetOwner()
	{
		return petOwner;
	}

	public void setPetOwner(Long petOwner)
	{
		this.petOwner = petOwner;
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
