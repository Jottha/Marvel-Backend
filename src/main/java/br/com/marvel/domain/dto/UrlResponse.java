package br.com.marvel.domain.dto;

import java.io.Serializable;

public class UrlResponse implements Serializable {

	private static final long serialVersionUID = 6243635481213103580L;

	private String type;

	private String url;

	private CharacterResponse characterResponseList;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CharacterResponse getCharacterResponseList() {
		return characterResponseList;
	}

	public void setCharacterResponseList(CharacterResponse characterResponseList) {
		this.characterResponseList = characterResponseList;
	}
}
