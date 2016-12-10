package com.warcrafttool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * ReportTable model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportTable
{
	private String reportTitle;
	private List<ReportTableEntry> entries;
	private Long totalAmount = 0L;
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

	public Long getTotalAmount()
	{
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount)
	{
		this.totalAmount = totalAmount;
	}

	public void addToTotal(Long amount)
	{
		this.totalAmount += amount;
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
