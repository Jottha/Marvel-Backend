package br.com.marvel.domain.dto;

import java.io.Serializable;
import java.util.List;

import br.com.marvel.domain.model.CharacterDataContainer;
import br.com.marvel.domain.model.ComicList;
import br.com.marvel.domain.model.EventList;
import br.com.marvel.domain.model.SeriesList;
import br.com.marvel.domain.model.StoryList;

public class CharacterResponse  implements Serializable {

	private static final long serialVersionUID = 8734796729494974363L;

	private String id;

	private String name;

	private String description;

	private String modified;

	private String resourceUri;

	private List<UrlResponse> listUrlResponse;

	private ImageResponse imThumbnail;

	private List<ComicList> listComicList;

	private List<StoryList> listStoryList;

	private List<EventList> listEventList;

	private List<SeriesList> listSeriesList;

	private CharacterDataContainer characterDataContainer;

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

	public List<ComicList> getListComicList() {
		return listComicList;
	}

	public void setListComicList(List<ComicList> listComicList) {
		this.listComicList = listComicList;
	}

	public List<StoryList> getListStoryList() {
		return listStoryList;
	}

	public void setListStoryList(List<StoryList> listStoryList) {
		this.listStoryList = listStoryList;
	}

	public List<EventList> getListEventList() {
		return listEventList;
	}

	public void setListEventList(List<EventList> listEventList) {
		this.listEventList = listEventList;
	}

	public List<SeriesList> getListSeriesList() {
		return listSeriesList;
	}

	public void setListSeriesList(List<SeriesList> listSeriesList) {
		this.listSeriesList = listSeriesList;
	}

	public CharacterDataContainer getCharacterDataContainer() {
		return characterDataContainer;
	}

	public void setCharacterDataContainer(CharacterDataContainer characterDataContainer) {
		this.characterDataContainer = characterDataContainer;
	}
}
