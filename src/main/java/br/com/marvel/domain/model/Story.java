package br.com.marvel.domain.model;

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
@Table(name = "tb_story_list")
public class Story implements Serializable {

	private static final long serialVersionUID = -3009376004251360355L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The number of total available stories in this list. Will always be greater than or equal to the "returned" value.,
	@Column(name = "total_available")
	private int available;

	//The number of stories returned in this collection (up to 20).,
	@Column(name = "returned")
	private int returned;

	//The path to the full list of stories in this collection.,
	@Column(name = "collection_uri")
	private String collectionUri;

	//The list of returned stories in this collection.
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "storyList")
	private List<StorySummary> listStorySummary;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "character_id")
	private Character character;

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

	public List<StorySummary> getListStorySummary() {
		return listStorySummary;
	}

	public void setListStorySummary(List<StorySummary> listStorySummary) {
		this.listStorySummary = listStorySummary;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
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
		if (!(obj instanceof Story)) {
			return false;
		}
		Story other = (Story) obj;
		return Objects.equals(id, other.id);
	}
}
