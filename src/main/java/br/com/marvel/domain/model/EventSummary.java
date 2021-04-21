package br.com.marvel.domain.model;

import java.io.Serializable;

public class EventSummary implements Serializable {

	private static final long serialVersionUID = 4972610934850365689L;

	private String resourceUri;

	private String name;

	private EventList eventList;

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EventList getEventList() {
		return eventList;
	}

	public void setEventList(EventList eventList) {
		this.eventList = eventList;
	}
}
