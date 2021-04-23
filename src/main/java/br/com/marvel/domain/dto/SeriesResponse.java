package br.com.marvel.domain.dto;

import java.io.Serializable;
import java.util.List;

public class SeriesResponse implements Serializable {

	private static final long serialVersionUID = -373930138439891377L;

	private String available; 

	private String returned;

	private String collectionUri;

	private List<SeriesSummaryResponse> listSeriesSummaryResponse;

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

	public List<SeriesSummaryResponse> getListSeriesSummaryResponse() {
		return listSeriesSummaryResponse;
	}

	public void setListSeriesSummaryResponse(List<SeriesSummaryResponse> listSeriesSummaryResponse) {
		this.listSeriesSummaryResponse = listSeriesSummaryResponse;
	}

	public CharacterResponse getCharacterResponseList() {
		return characterResponseList;
	}

	public void setCharacterResponseList(CharacterResponse characterResponseList) {
		this.characterResponseList = characterResponseList;
	}
}
