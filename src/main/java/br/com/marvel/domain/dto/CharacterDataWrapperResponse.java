package br.com.marvel.domain.dto;

import java.io.Serializable;

public class CharacterDataWrapperResponse implements Serializable {

	private static final long serialVersionUID = -2548461049044162639L;

	private Long id;

	private int code;

	private String status;

	private String copyRight;

	private String attributionText;

	private String attributionHtml;

	private CharacterDataContainerResponse characterDataContainerResponse;

	private String etag ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCopyRight() {
		return copyRight;
	}

	public void setCopyRight(String copyRight) {
		this.copyRight = copyRight;
	}

	public String getAttributionText() {
		return attributionText;
	}

	public void setAttributionText(String attributionText) {
		this.attributionText = attributionText;
	}

	public String getAttributionHtml() {
		return attributionHtml;
	}

	public void setAttributionHtml(String attributionHtml) {
		this.attributionHtml = attributionHtml;
	}

	public CharacterDataContainerResponse getCharacterDataContainerResponse() {
		return characterDataContainerResponse;
	}

	public void setCharacterDataContainerResponse(CharacterDataContainerResponse characterDataContainerResponse) {
		this.characterDataContainerResponse = characterDataContainerResponse;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}
}
