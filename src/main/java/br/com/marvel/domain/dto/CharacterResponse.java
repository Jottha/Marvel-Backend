package br.com.marvel.domain.dto;

import java.io.Serializable;
import java.util.List;

public class CharacterResponse  implements Serializable {

	private static final long serialVersionUID = 8734796729494974363L;

	private String id;

	private String name;

	private String description;

	private String modified;

	private String resourceUri;

	private List<UrlResponse> listUrlResponse;

	private ImageResponse imThumbnail;

	private List<ComicResponse> listComicListResponse;

	private List<StoryResponse> listStoryListResponse;

	private List<EventResponse> listEventListResponse;

	private List<SeriesResponse> listSeriesListResponse;

	private CharacterDataContainerResponse characterDataContainerResponse;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public List<UrlResponse> getListUrlResponse() {
		return listUrlResponse;
	}

	public void setListUrlResponse(List<UrlResponse> listUrlResponse) {
		this.listUrlResponse = listUrlResponse;
	}

	public ImageResponse getImThumbnail() {
		return imThumbnail;
	}

	public void setImThumbnail(ImageResponse imThumbnail) {
		this.imThumbnail = imThumbnail;
	}

	public List<ComicResponse> getListComicListResponse() {
		return listComicListResponse;
	}

	public void setListComicListResponse(List<ComicResponse> listComicListResponse) {
		this.listComicListResponse = listComicListResponse;
	}

	public List<StoryResponse> getListStoryListResponse() {
		return listStoryListResponse;
	}

	public void setListStoryListResponse(List<StoryResponse> listStoryListResponse) {
		this.listStoryListResponse = listStoryListResponse;
	}

	public List<EventResponse> getListEventListResponse() {
		return listEventListResponse;
	}

	public void setListEventListResponse(List<EventResponse> listEventListResponse) {
		this.listEventListResponse = listEventListResponse;
	}

	public List<SeriesResponse> getListSeriesListResponse() {
		return listSeriesListResponse;
	}

	public void setListSeriesListResponse(List<SeriesResponse> listSeriesListResponse) {
		this.listSeriesListResponse = listSeriesListResponse;
	}

	public CharacterDataContainerResponse getCharacterDataContainerResponse() {
		return characterDataContainerResponse;
	}

	public void setCharacterDataContainerResponse(CharacterDataContainerResponse characterDataContainerResponse) {
		this.characterDataContainerResponse = characterDataContainerResponse;
	}
}
