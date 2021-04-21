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

public class ComicSummary implements Serializable {

	private static final long serialVersionUID = -2557025930143185413L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The path to the individual comic resource.,
	@Column(name = "resource_uri")
	private String resourceUri;

	//The canonical name of the comic.
	@Column(name = "name")
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "comic_list_id")
	private ComicList comicList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ComicList getComicList() {
		return comicList;
	}

	public void setComicList(ComicList comicList) {
		this.comicList = comicList;
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
		if (!(obj instanceof ComicSummary)) {
			return false;
		}
		ComicSummary other = (ComicSummary) obj;
		return Objects.equals(id, other.id);
	}
}
