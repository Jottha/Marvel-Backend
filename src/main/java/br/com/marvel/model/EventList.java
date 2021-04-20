package br.com.marvel.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class EventList implements Serializable {

	private static final long serialVersionUID = 4253080937560418455L;

	//The number of total available events in this list. Will always be greater than or equal to the "returned" value.,
	private int available;
	//The number of events returned in this collection (up to 20).,
	private int returned;
	//The path to the full list of events in this collection.,
	collectionURI (string, optional): 
	//The list of returned events in this collection.
	items (Array[EventSummary], optional): 
	
	
	//items (Array[SeriesSummary], optional): 
	//The list of returned series in this collection.
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eventList")
	private List<EventSummary> listEventSummary;

	
}
