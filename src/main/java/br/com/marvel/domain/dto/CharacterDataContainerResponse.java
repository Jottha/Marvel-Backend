package br.com.marvel.domain.dto;

import java.io.Serializable;
import java.util.List;

public class CharacterDataContainerResponse implements Serializable {

	private static final long serialVersionUID = 2200641663494109095L;

	private String offset;

	private String limit;

	private String total;

	private String count;

	private List<CharacterResponse> listCharacterResultsResponse;

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public List<CharacterResponse> getListCharacterResultsResponse() {
		return listCharacterResultsResponse;
	}

	public void setListCharacterResultsResponse(List<CharacterResponse> listCharacterResultsResponse) {
		this.listCharacterResultsResponse = listCharacterResultsResponse;
	}
}
