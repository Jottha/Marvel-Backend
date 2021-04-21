package br.com.marvel.domain.dto;

import java.io.Serializable;

public class EventSummaryResponse implements Serializable {

	private static final long serialVersionUID = 7971327722041843498L;

	private String resourceUri;

	private String name;

	private EventListResponse eventListResponse;

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

	public EventListResponse getEventListResponse() {
		return eventListResponse;
	}

	public void setEventListResponse(EventListResponse eventListResponse) {
		this.eventListResponse = eventListResponse;
	}
}
