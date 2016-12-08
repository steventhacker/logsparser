package com.warcrafttool.model;

/**
 * HitDetails Model
 */
public class HitDetails
{
	private String type;
	private Long total;
	private Long count;
	private Long absorbOrOverheal;
	private int min;
	private int max;

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Long getTotal()
	{
		return total;
	}

	public void setTotal(Long total)
	{
		this.total = total;
	}

	public Long getCount()
	{
		return count;
	}

	public void setCount(Long count)
	{
		this.count = count;
	}

	public Long getAbsorbOrOverheal()
	{
		return absorbOrOverheal;
	}

	public void setAbsorbOrOverheal(Long absorbOrOverheal)
	{
		this.absorbOrOverheal = absorbOrOverheal;
	}

	public int getMin()
	{
		return min;
	}

	public void setMin(int min)
	{
		this.min = min;
	}

	public int getMax()
	{
		return max;
	}

	public void setMax(int max)
	{
		this.max = max;
	}
}
