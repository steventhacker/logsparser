package com.warcrafttool.model;

/**
 * Ability model
 */
public class Ability
{
	private String name;
	private int guid;
	private int type;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getGuid()
	{
		return guid;
	}

	public void setGuid(int guid)
	{
		this.guid = guid;
	}

	public int getType()
	{
		return type;
	}

	public void setType(int type)
	{
		this.type = type;
	}
}
