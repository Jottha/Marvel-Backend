package br.com.marvel.domain.dto;

import java.io.Serializable;
import java.util.List;

public class StoryListResponse implements Serializable {
	
	private static final long serialVersionUID = -6509220437617739142L;

	private Long id;

	private int available;

	private int returned;

	private String collectionUri;

	private List<StorySummaryResponse> listStorySummaryResponse;

	private CharacterResponse characterResponseList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public int getReturned() {
		return returned;
	}

	public void setReturned(int returned) {
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
