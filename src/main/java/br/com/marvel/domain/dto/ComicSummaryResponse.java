package br.com.marvel.domain.dto;

import java.io.Serializable;

public class ComicSummaryResponse implements Serializable {

	private static final long serialVersionUID = -3581509098777343476L;

	private String resourceUri;

	private String name;

	private ComicResponse comicListResponse;

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

	public ComicResponse getComicListResponse() {
		return comicListResponse;
	}

	public void setComicListResponse(ComicResponse comicListResponse) {
		this.comicListResponse = comicListResponse;
	}
}
