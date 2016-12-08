package com.warcrafttool.model;

/**
 * Artifact model
 */
public class Artifact
{
	private int traitID;
	private int rank;
	private int spellID;

	public int getTraitID()
	{
		return traitID;
	}

	public void setTraitID(int traitID)
	{
		this.traitID = traitID;
	}

	public int getRank()
	{
		return rank;
	}

	public void setRank(int rank)
	{
		this.rank = rank;
	}

	public int getSpellID()
	{
		return spellID;
	}

	public void setSpellID(int spellID)
	{
		this.spellID = spellID;
	}
}
