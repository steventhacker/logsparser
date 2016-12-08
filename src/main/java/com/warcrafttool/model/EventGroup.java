package com.warcrafttool.model;

import java.util.List;

/**
 * EventGroup model
 */
public class EventGroup
{
	List<Event> events;
	private Long nextPageTimestamp;

	public List<Event> getEvents()
	{
		return events;
	}

	public void setEvents(List<Event> events)
	{
		this.events = events;
	}

	public Long getNextPageTimestamp()
	{
		return nextPageTimestamp;
	}

	public void setNextPageTimestamp(Long nextPageTimestamp)
	{
		this.nextPageTimestamp = nextPageTimestamp;
	}
}
