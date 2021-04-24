package br.com.marvel.commos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Request implements Serializable {

	private static final long serialVersionUID = 6680078402589163932L;

	private String name;
	private String nameStartsWith;
	private Date modifiedSince;
	private List<Long> comics;
	private List<Long> series;
	private List<Long> events;
	private List<Long> stories;

	public Request() {}
	
	public Request(String name, String nameStartsWith, Date modifiedSince, List<Long> comics, List<Long> series,
			List<Long> events, List<Long> stories) {
		super();
		this.name = name;
		this.nameStartsWith = nameStartsWith;
		this.modifiedSince = modifiedSince;
		this.comics = comics;
		this.series = series;
		this.events = events;
		this.stories = stories;
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
}
