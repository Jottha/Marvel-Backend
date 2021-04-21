package br.com.marvel.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Url implements Serializable {

	private static final long serialVersionUID = -296617366405646919L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//A text identifier for the URL.,
	@Column(name = "type")
	private String type;

	//A full URL (including scheme, domain, and path).
	@Column(name = "url")
	private String url;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "character_list_id")
	private Character characterList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public Character getCharacterList() {
		return characterList;
	}

	public void setCharacterList(Character characterList) {
		this.characterList = characterList;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Url)) {
			return false;
		}
		Url other = (Url) obj;
		return Objects.equals(id, other.id);
	}
}
