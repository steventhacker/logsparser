package com.warcrafttool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Report model
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Report
{
	private String id;
	private String title;
	private String owner;
	private Long zone;
	private Double startTime;
	private Double endTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Long getZone() {
		return zone;
	}

	public void setZone(Long zone) {
		this.zone = zone;
	}

	public Double getStartTime() {
		return startTime;
	}

	public void setStartTime(Double startTime) {
		this.startTime = startTime;
	}

	public Double getEndTime() {
		return endTime;
	}

	public void setEndTime(Double endTime) {
		this.endTime = endTime;
	}
}