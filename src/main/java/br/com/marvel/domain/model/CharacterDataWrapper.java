package br.com.marvel.domain.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_character_data_wrapper")
public class CharacterDataWrapper implements Serializable {

	private static final long serialVersionUID = 5559356123357751604L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The HTTP status code of the returned result.,
	@Column(name = "code")
	private int code;

	//A string description of the call status.,
	@Column(name = "status")
	private String status;

	//The copyright notice for the returned result.,
	@Column(name = "copyRight")
	private String copyRight;

	//The attribution notice for this result. Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.,
	@Column(name = "attributionText")
	private String attributionText;

	//An HTML representation of the attribution notice for this result. Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.,
	@Column(name = "attributionHtml")
	private String attributionHtml;

	//The results returned by the call.,
	@OneToOne
	@JoinColumn(name = "characterDataContainer")
	private CharacterDataContainer characterDataContainer;

	//A digest value of the content returned by the call.
	@Column(name = "etag")
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

	public CharacterDataContainer getCharacterDataContainer() {
		return characterDataContainer;
	}

	public void setCharacterDataContainer(CharacterDataContainer characterDataContainer) {
		this.characterDataContainer = characterDataContainer;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CharacterDataWrapper)) {
			return false;
		}
		CharacterDataWrapper other = (CharacterDataWrapper) obj;
		return Objects.equals(id, other.id);
	}
}
