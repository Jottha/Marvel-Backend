package br.com.marvel.domain.dto;

import java.io.Serializable;
import java.util.List;

public class ComicListResponse implements Serializable {

	private static final long serialVersionUID = 4522599910640613359L;

	private int available;

	private int returned;

	private String collectionUri;

	private List<ComicSummaryResponse> listComicSummaryResponse;

	private CharacterResponse characterResponse;

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

	public List<ComicSummaryResponse> getListComicSummaryResponse() {
		return listComicSummaryResponse;
	}

	public void setListComicSummaryResponse(List<ComicSummaryResponse> listComicSummaryResponse) {
		this.listComicSummaryResponse = listComicSummaryResponse;
	}

	public CharacterResponse getCharacterResponse() {
		return characterResponse;
	}

	public void setCharacterResponse(CharacterResponse characterResponse) {
		this.characterResponse = characterResponse;
	}
}