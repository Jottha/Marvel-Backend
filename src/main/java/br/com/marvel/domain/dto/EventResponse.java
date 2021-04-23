package br.com.marvel.domain.dto;

import java.io.Serializable;
import java.util.List;

public class EventResponse implements Serializable {

	private static final long serialVersionUID = -888426133224072876L;

	private String available;

	private String returned;

	private String collectionUri;

	private List<EventSummaryResponse> listEventSummaryResponse;

	private CharacterResponse characterResponse;

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

	public List<EventSummaryResponse> getListEventSummaryResponse() {
		return listEventSummaryResponse;
	}

	public void setListEventSummaryResponse(List<EventSummaryResponse> listEventSummaryResponse) {
		this.listEventSummaryResponse = listEventSummaryResponse;
	}

	public CharacterResponse getCharacterResponse() {
		return characterResponse;
	}

	public void setCharacterResponse(CharacterResponse characterResponse) {
		this.characterResponse = characterResponse;
	}
}
