package com.warcrafttool.model;

import java.util.List;

/**
 * ReportTable model
 */
public class ReportTable
{
	private String reportTitle;
	private List<ReportTableEntry> entries;
	private Long totalHealing = 0L;
	private Long totalTime;

	public String getReportTitle()
	{
		return reportTitle;
	}

	public void setReportTitle(String reportTitle)
	{
		this.reportTitle = reportTitle;
	}

	public List<ReportTableEntry> getEntries()
	{
		return entries;
	}

	public void setEntries(List<ReportTableEntry> entries)
	{
		this.entries = entries;
	}

	public Long getTotalHealing()
	{
		return totalHealing;
	}

	public void setTotalHealing(Long totalHealing)
	{
		this.totalHealing = totalHealing;
	}

	public void addToTotalHealing(Long amount)
	{
		this.totalHealing += amount;
	}

	public Long getTotalTime()
	{
		return totalTime;
	}

	public void setTotalTime(Long totalTime)
	{
		this.totalTime = totalTime;
	}
}
