package br.com.marvel.domain.dto;

import java.io.Serializable;

public class StorySummaryResponse implements Serializable {

	private static final long serialVersionUID = -2382350869887838952L;

	private String resourceUri;

	private String name;

	private String type;

	private StoryResponse StoryListResponse;

	private CharacterResponse characterResponseList;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public StoryResponse getStoryListResponse() {
		return StoryListResponse;
	}

	public void setStoryListResponse(StoryResponse storyListResponse) {
		StoryListResponse = storyListResponse;
	}

	public CharacterResponse getCharacterResponseList() {
		return characterResponseList;
	}

	public void setCharacterResponseList(CharacterResponse characterResponseList) {
		this.characterResponseList = characterResponseList;
	}
}
