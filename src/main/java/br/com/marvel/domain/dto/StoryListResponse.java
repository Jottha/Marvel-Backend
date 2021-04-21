package br.com.marvel.domain.dto;

import java.io.Serializable;
import java.util.List;

public class StoryListResponse implements Serializable {
	
	private static final long serialVersionUID = -6509220437617739142L;

	private String available;

	private String returned;

	private String collectionUri;

	private List<StorySummaryResponse> listStorySummaryResponse;

	private CharacterResponse characterResponseList;

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getReturned() {
		return returned;
	}

	public void setReturned(String returned) {
		this.returned = returned;
	}

	public String getCollectionUri() {
		return collectionUri;
	}

	public void setCollectionUri(String collectionUri) {
		this.collectionUri = collectionUri;
	}

	public List<StorySummaryResponse> getListStorySummaryResponse() {
		return listStorySummaryResponse;
	}

	public void setListStorySummaryResponse(List<StorySummaryResponse> listStorySummaryResponse) {
		this.listStorySummaryResponse = listStorySummaryResponse;
	}

	public CharacterResponse getCharacterResponseList() {
		return characterResponseList;
	}

	public void setCharacterResponseList(CharacterResponse characterResponseList) {
		this.characterResponseList = characterResponseList;
	}
}
