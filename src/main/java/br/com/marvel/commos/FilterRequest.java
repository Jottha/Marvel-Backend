package br.com.marvel.commos;

import java.util.Date;
import java.util.List;

public class FilterRequest<T> extends Request {

	private static final long serialVersionUID = 1029804109638604909L;

	private T data;
	
	public FilterRequest(String name, String nameStartsWith, Date modifiedSince, List<Long> comics, List<Long> series,
			List<Long> events, List<Long> stories) {
		this.setName(name);
		this.setNameStartsWith(nameStartsWith);
		this.setModifiedSince(modifiedSince);
		this.setComics(comics);
		this.setSeries(series);
		this.setEvents(events);
		this.setStories(stories);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
