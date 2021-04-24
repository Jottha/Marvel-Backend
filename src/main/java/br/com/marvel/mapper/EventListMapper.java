package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.EventResponse;
import br.com.marvel.domain.model.Event;

public class EventListMapper {

	public static List<EventResponse> createEventListResponseList(List<Event> listEventList) {
		List<EventResponse> eventListResponseList = new ArrayList<EventResponse>();

		listEventList.forEach(eventList -> {
			eventListResponseList.add(createEventListResponse(eventList));
		});

		return eventListResponseList;
	}

	public static EventResponse createEventListResponse(Event eventList) {
		EventResponse eventListResponse = new EventResponse ();

		eventListResponse.setAvailable(String.valueOf( eventList.getAvailable()));
		eventListResponse.setReturned(String.valueOf(eventList.getReturned()));
		eventListResponse.setCollectionUri(eventList.getCollectionUri());
		eventListResponse.setListEventSummaryResponse(EventSummaryMapper.createEventSummaryResponseList(eventList.getListEventSummary()));

		return eventListResponse;
	}
}
