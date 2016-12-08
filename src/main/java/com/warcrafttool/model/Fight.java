package com.warcrafttool.model;

import com.google.gson.annotations.SerializedName;

/**
 * Fight model
 */
public class Fight
{

	private Long id;
	@SerializedName("start_time")
	private Long startTime;
	@SerializedName("end_time")
	private Long endTime;
	private Long boss;
	private String name;
	private Long size;
	private Long difficulty;
	private Boolean kill;
	private Long bossPercentage;
	private Long partial;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getStartTime()
	{
		return startTime;
	}

	public void setStartTime(Long startTime)
	{
		this.startTime = startTime;
	}

	public Long getEndTime()
	{
		return endTime;
	}

	public void setEndTime(Long endTime)
	{
		this.endTime = endTime;
	}

	public Long getBoss()
	{
		return boss;
	}

	public void setBoss(Long boss)
	{
		this.boss = boss;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Long getSize()
	{
		return size;
	}

	public void setSize(Long size)
	{
		this.size = size;
	}

	public Long getDifficulty()
	{
		return difficulty;
	}

	public void setDifficulty(Long difficulty)
	{
		this.difficulty = difficulty;
	}

	public Boolean getKill()
	{
		return kill;
	}

	public void setKill(Boolean kill)
	{
		this.kill = kill;
	}

	public Long getBossPercentage()
	{
		return bossPercentage;
	}

	public void setBossPercentage(Long bossPercentage)
	{
		this.bossPercentage = bossPercentage;
	}

	public Long getPartial()
	{
		return partial;
	}

	public void setPartial(Long partial)
	{
		this.partial = partial;
	}

}
