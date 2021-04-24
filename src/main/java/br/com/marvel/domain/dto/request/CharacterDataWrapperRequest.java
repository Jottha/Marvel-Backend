package br.com.marvel.domain.dto.request;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CharacterDataWrapperRequest implements Serializable {
	
	private static final long serialVersionUID = -2985634736491499926L;

	private String name;

	private String nameStartsWith;

	private Date modifiedSince;

	private List<Long> comics;

	private List<Long> series;

	private List<Long> events;

	private List<Long> stories;

	private String sortByAttribute;

	public CharacterDataWrapperRequest() {

	}

	public CharacterDataWrapperRequest(String name, String nameStartsWith, Date modifiedSince, List<Long> comics,
			List<Long> series, List<Long> events, List<Long> stories, String sortByAttribute) {
		super();
		this.name = name;
		this.nameStartsWith = nameStartsWith;
		this.modifiedSince = modifiedSince;
		this.comics = comics;
		this.series = series;
		this.events = events;
		this.stories = stories;
		this.sortByAttribute = sortByAttribute;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameStartsWith() {
		return nameStartsWith;
	}

	public void setNameStartsWith(String nameStartsWith) {
		this.nameStartsWith = nameStartsWith;
	}

	public Date getModifiedSince() {
		return modifiedSince;
	}

	public void setModifiedSince(Date modifiedSince) {
		this.modifiedSince = modifiedSince;
	}

	public List<Long> getComics() {
		return comics;
	}

	public void setComics(List<Long> comics) {
		this.comics = comics;
	}

	public List<Long> getSeries() {
		return series;
	}

	public void setSeries(List<Long> series) {
		this.series = series;
	}

	public List<Long> getEvents() {
		return events;
	}

	public void setEvents(List<Long> events) {
		this.events = events;
	}

	public List<Long> getStories() {
		return stories;
	}

	public void setStories(List<Long> stories) {
		this.stories = stories;
	}

	public String getSortByAttribute() {
		return sortByAttribute;
	}

	public void setSortByAttribute(String sortByAttribute) {
		this.sortByAttribute = sortByAttribute;
	}
}
