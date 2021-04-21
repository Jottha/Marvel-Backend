package br.com.marvel.domain.dto;

import java.io.Serializable;

public class SeriesSummaryResponse implements Serializable {

	private static final long serialVersionUID = -6843967890086020579L;

	private Long id;

	private String resourceUri;

	private String name;

	private SeriesListResponse seriesListResponse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public SeriesListResponse getSeriesListResponse() {
		return seriesListResponse;
	}

	public void setSeriesListResponse(SeriesListResponse seriesListResponse) {
		this.seriesListResponse = seriesListResponse;
	}
}
