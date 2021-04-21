package br.com.marvel.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "comic_list")
public class ComicList implements Serializable {

	private static final long serialVersionUID = -2264303531840109055L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The number of total available issues in this list. Will always be greater than or equal to the "returned" value.,
	@Column(name = "total_available")
	private int available;

	//The number of issues returned in this collection (up to 20).,
	@Column(name = "returned")
	private int returned;

	//The path to the full list of issues in this collection.,
	@Column(name = "collection_uri")
	private String collectionUri;

	//The list of returned issues in this collection.
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "comicList")
	private List<ComicSummary> listComicSummary;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "character_list_id")
	private Character characterList;

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

	public List<ComicSummary> getListComicSummary() {
		return listComicSummary;
	}

	public void setListComicSummary(List<ComicSummary> listComicSummary) {
		this.listComicSummary = listComicSummary;
	}

	public Character getCharacterList() {
		return characterList;
	}

	public void setCharacterList(Character characterList) {
		this.characterList = characterList;
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
		if (!(obj instanceof ComicList)) {
			return false;
		}
		ComicList other = (ComicList) obj;
		return Objects.equals(id, other.id);
	}
}
