package com.warcrafttool.model;

import java.util.ArrayList;
import java.util.List;

/**
 * FightGroup model
 */
public class FightGroup
{

	private List<Fight> fights = new ArrayList<Fight>();
	private String lang;
	private List<Friendly> friendlies = new ArrayList<Friendly>();
	private List<Enemy> enemies = new ArrayList<Enemy>();
	private List<FriendlyPet> friendlyPets = new ArrayList<FriendlyPet>();
	private List<EnemyPet> enemyPets = new ArrayList<EnemyPet>();
	private List<Phase> phases = new ArrayList<Phase>();
	private String title;
	private String owner;
	private Double start;
	private Double end;
	private Long zone;

	public List<Fight> getFights()
	{
		return fights;
	}

	public void setFights(List<Fight> fights)
	{
		this.fights = fights;
	}

	public String getLang()
	{
		return lang;
	}

	public void setLang(String lang)
	{
		this.lang = lang;
	}

	public List<Friendly> getFriendlies()
	{
		return friendlies;
	}

	public void setFriendlies(List<Friendly> friendlies)
	{
		this.friendlies = friendlies;
	}

	public List<Enemy> getEnemies()
	{
		return enemies;
	}

	public void setEnemies(List<Enemy> enemies)
	{
		this.enemies = enemies;
	}

	public List<FriendlyPet> getFriendlyPets()
	{
		return friendlyPets;
	}

	public void setFriendlyPets(List<FriendlyPet> friendlyPets)
	{
		this.friendlyPets = friendlyPets;
	}

	public List<EnemyPet> getEnemyPets()
	{
		return enemyPets;
	}

	public void setEnemyPets(List<EnemyPet> enemyPets)
	{
		this.enemyPets = enemyPets;
	}

	public List<Phase> getPhases()
	{
		return phases;
	}

	public void setPhases(List<Phase> phases)
	{
		this.phases = phases;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getOwner()
	{
		return owner;
	}

	public void setOwner(String owner)
	{
		this.owner = owner;
	}

	public Double getStart()
	{
		return start;
	}

	public void setStart(Double start)
	{
		this.start = start;
	}

	public Double getEnd()
	{
		return end;
	}

	public void setEnd(Double end)
	{
		this.end = end;
	}

	public Long getZone()
	{
		return zone;
	}

	public void setZone(Long zone)
	{
		this.zone = zone;
	}
}