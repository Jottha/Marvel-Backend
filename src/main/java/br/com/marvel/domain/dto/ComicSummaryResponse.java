package br.com.marvel.domain.dto;

import java.io.Serializable;

public class ComicSummaryResponse implements Serializable {

	private static final long serialVersionUID = -3581509098777343476L;

	private String resourceUri;

	private String name;

	private ComicListResponse comicListResponse;

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

	public ComicListResponse getComicListResponse() {
		return comicListResponse;
	}

	public void setComicListResponse(ComicListResponse comicListResponse) {
		this.comicListResponse = comicListResponse;
	}
}
