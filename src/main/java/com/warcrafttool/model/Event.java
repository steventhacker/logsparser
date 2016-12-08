package com.warcrafttool.model;

import java.util.List;

/**
 * Event class
 */
@SuppressWarnings("unused")
public class Event
{
	private Long timestamp;
	private String type;
	private String name;
	private int difficulty;
	private int size;
	private int encounterID;
	private int sourceID;
	private int specID;
	private int strength;
	private int agility;
	private int stamina;
	private int intellect;
	private int dodge;
	private int parry;
	private int block;
	private int armor;
	private int critMelee;
	private int critRanged;
	private int critSpell;
	private int speed;
	private int leech;
	private int hasteMelee;
	private int hasteRanged;
	private int hasteSpell;
	private int avoidance;
	private int mastery;
	private int versatilityDamageDone;
	private int versatilityHealingDone;
	private int versatilityDamageReduction;
	private int hitType;
	private List<Integer> talents;
	private List<Integer> pvpTalents;
	private Ability ability;
	private Long amount;
	private Long overheal;

	public Long getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(Long timestamp)
	{
		this.timestamp = timestamp;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getDifficulty()
	{
		return difficulty;
	}

	public void setDifficulty(int difficulty)
	{
		this.difficulty = difficulty;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public int getEncounterID()
	{
		return encounterID;
	}

	public void setEncounterID(int encounterID)
	{
		this.encounterID = encounterID;
	}

	public int getSourceID()
	{
		return sourceID;
	}

	public void setSourceID(int sourceID)
	{
		this.sourceID = sourceID;
	}

	public int getSpecID()
	{
		return specID;
	}

	public void setSpecID(int specID)
	{
		this.specID = specID;
	}

	public int getStrength()
	{
		return strength;
	}

	public void setStrength(int strength)
	{
		this.strength = strength;
	}

	public int getAgility()
	{
		return agility;
	}

	public void setAgility(int agility)
	{
		this.agility = agility;
	}

	public int getStamina()
	{
		return stamina;
	}

	public void setStamina(int stamina)
	{
		this.stamina = stamina;
	}

	public int getIntellect()
	{
		return intellect;
	}

	public void setIntellect(int intellect)
	{
		this.intellect = intellect;
	}

	public int getDodge()
	{
		return dodge;
	}

	public void setDodge(int dodge)
	{
		this.dodge = dodge;
	}

	public int getParry()
	{
		return parry;
	}

	public void setParry(int parry)
	{
		this.parry = parry;
	}

	public int getBlock()
	{
		return block;
	}

	public void setBlock(int block)
	{
		this.block = block;
	}

	public int getArmor()
	{
		return armor;
	}

	public void setArmor(int armor)
	{
		this.armor = armor;
	}

	public int getCritMelee()
	{
		return critMelee;
	}

	public void setCritMelee(int critMelee)
	{
		this.critMelee = critMelee;
	}

	public int getCritRanged()
	{
		return critRanged;
	}

	public void setCritRanged(int critRanged)
	{
		this.critRanged = critRanged;
	}

	public int getCritSpell()
	{
		return critSpell;
	}

	public void setCritSpell(int critSpell)
	{
		this.critSpell = critSpell;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public int getLeech()
	{
		return leech;
	}

	public void setLeech(int leech)
	{
		this.leech = leech;
	}

	public int getHasteMelee()
	{
		return hasteMelee;
	}

	public void setHasteMelee(int hasteMelee)
	{
		this.hasteMelee = hasteMelee;
	}

	public int getHasteRanged()
	{
		return hasteRanged;
	}

	public void setHasteRanged(int hasteRanged)
	{
		this.hasteRanged = hasteRanged;
	}

	public int getHasteSpell()
	{
		return hasteSpell;
	}

	public void setHasteSpell(int hasteSpell)
	{
		this.hasteSpell = hasteSpell;
	}

	public int getAvoidance()
	{
		return avoidance;
	}

	public void setAvoidance(int avoidance)
	{
		this.avoidance = avoidance;
	}

	public int getMastery()
	{
		return mastery;
	}

	public void setMastery(int mastery)
	{
		this.mastery = mastery;
	}

	public int getVersatilityDamageDone()
	{
		return versatilityDamageDone;
	}

	public void setVersatilityDamageDone(int versatilityDamageDone)
	{
		this.versatilityDamageDone = versatilityDamageDone;
	}

	public int getVersatilityHealingDone()
	{
		return versatilityHealingDone;
	}

	public void setVersatilityHealingDone(int versatilityHealingDone)
	{
		this.versatilityHealingDone = versatilityHealingDone;
	}

	public int getVersatilityDamageReduction()
	{
		return versatilityDamageReduction;
	}

	public void setVersatilityDamageReduction(int versatilityDamageReduction)
	{
		this.versatilityDamageReduction = versatilityDamageReduction;
	}

	public List<Integer> getTalents()
	{
		return talents;
	}

	public void setTalents(List<Integer> talents)
	{
		this.talents = talents;
	}

	public List<Integer> getPvpTalents()
	{
		return pvpTalents;
	}

	public void setPvpTalents(List<Integer> pvpTalents)
	{
		this.pvpTalents = pvpTalents;
	}

	public Ability getAbility()
	{
		return ability;
	}

	public void setAbility(Ability ability)
	{
		this.ability = ability;
	}

	public int getHitType()
	{
		return hitType;
	}

	public void setHitType(int hitType)
	{
		this.hitType = hitType;
	}

	public Long getAmount()
	{
		return amount;
	}

	public void setAmount(Long amount)
	{
		this.amount = amount;
	}

	public Long getOverheal()
	{
		return overheal;
	}

	public void setOverheal(Long overheal)
	{
		this.overheal = overheal;
	}
}
