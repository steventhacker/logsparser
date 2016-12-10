package com.warcrafttool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Phase model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Phase
{
	private Long boss;
	private List<String> phases = new ArrayList<String>();

	public Long getBoss()
	{
		return boss;
	}

	public void setBoss(Long boss)
	{
		this.boss = boss;
	}

	public List<String> getPhases()
	{
		return phases;
	}

	public void setPhases(List<String> phases)
	{
		this.phases = phases;
	}

}
