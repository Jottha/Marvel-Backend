package br.com.marvel.domain.dto;

import java.io.Serializable;

public class SeriesSummaryResponse implements Serializable {

	private static final long serialVersionUID = -6843967890086020579L;

	private String resourceUri;

	private String name;

	private SeriesResponse seriesListResponse;

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

	public SeriesResponse getSeriesListResponse() {
		return seriesListResponse;
	}

	public void setSeriesListResponse(SeriesResponse seriesListResponse) {
		this.seriesListResponse = seriesListResponse;
	}
}
