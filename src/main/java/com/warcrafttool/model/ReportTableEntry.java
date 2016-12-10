package com.warcrafttool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Entry in report table
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportTableEntry
{
	private String name;
	private Long guid;
	private int actor;
	private int type;
	private String actorName;
	private String actorIcon;
	private String actorType;
	private Long total;
	private Long overheal;
	private Long hitCount;
	private Long ticketCount;
	private Long tickMissCount;
	private Long missCountt;
	private Long multistrikeHitCount;
	private Long multistrikeTickCount;
	private Long multistrikeMissCount;
	private Long multistrikeTickMissCount;
	private Long critHitCount;
	private Long critTickCount;
	private List<TableTarget> sources;
	private List<TableTarget> targets;
	private List<HitDetails> hitDetails;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Long getGuid()
	{
		return guid;
	}

	public void setGuid(Long guid)
	{
		this.guid = guid;
	}

	public int getActor()
	{
		return actor;
	}

	public void setActor(int actor)
	{
		this.actor = actor;
	}

	public int getType()
	{
		return type;
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public String getActorName()
	{
		return actorName;
	}

	public void setActorName(String actorName)
	{
		this.actorName = actorName;
	}

	public String getActorIcon()
	{
		return actorIcon;
	}

	public void setActorIcon(String actorIcon)
	{
		this.actorIcon = actorIcon;
	}

	public String getActorType()
	{
		return actorType;
	}

	public void setActorType(String actorType)
	{
		this.actorType = actorType;
	}

	public Long getTotal()
	{
		return total;
	}

	public void setTotal(Long total)
	{
		this.total = total;
	}

	public Long getOverheal()
	{
		return overheal;
	}

	public void setOverheal(Long overheal)
	{
		this.overheal = overheal;
	}

	public Long getHitCount()
	{
		return hitCount;
	}

	public void setHitCount(Long hitCount)
	{
		this.hitCount = hitCount;
	}

	public Long getTicketCount()
	{
		return ticketCount;
	}

	public void setTicketCount(Long ticketCount)
	{
		this.ticketCount = ticketCount;
	}

	public Long getTickMissCount()
	{
		return tickMissCount;
	}

	public void setTickMissCount(Long tickMissCount)
	{
		this.tickMissCount = tickMissCount;
	}

	public Long getMissCountt()
	{
		return missCountt;
	}

	public void setMissCountt(Long missCountt)
	{
		this.missCountt = missCountt;
	}

	public Long getMultistrikeHitCount()
	{
		return multistrikeHitCount;
	}

	public void setMultistrikeHitCount(Long multistrikeHitCount)
	{
		this.multistrikeHitCount = multistrikeHitCount;
	}

	public Long getMultistrikeTickCount()
	{
		return multistrikeTickCount;
	}

	public void setMultistrikeTickCount(Long multistrikeTickCount)
	{
		this.multistrikeTickCount = multistrikeTickCount;
	}

	public Long getMultistrikeMissCount()
	{
		return multistrikeMissCount;
	}

	public void setMultistrikeMissCount(Long multistrikeMissCount)
	{
		this.multistrikeMissCount = multistrikeMissCount;
	}

	public Long getMultistrikeTickMissCount()
	{
		return multistrikeTickMissCount;
	}

	public void setMultistrikeTickMissCount(Long multistrikeTickMissCount)
	{
		this.multistrikeTickMissCount = multistrikeTickMissCount;
	}

	public Long getCritHitCount()
	{
		return critHitCount;
	}

	public void setCritHitCount(Long critHitCount)
	{
		this.critHitCount = critHitCount;
	}

	public Long getCritTickCount()
	{
		return critTickCount;
	}

	public void setCritTickCount(Long critTickCount)
	{
		this.critTickCount = critTickCount;
	}

	public List<TableTarget> getSources()
	{
		return sources;
	}

	public void setSources(List<TableTarget> sources)
	{
		this.sources = sources;
	}

	public List<TableTarget> getTargets()
	{
		return targets;
	}

	public void setTargets(List<TableTarget> targets)
	{
		this.targets = targets;
	}

	public List<HitDetails> getHitDetails()
	{
		return hitDetails;
	}

	public void setHitDetails(List<HitDetails> hitDetails)
	{
		this.hitDetails = hitDetails;
	}
}
