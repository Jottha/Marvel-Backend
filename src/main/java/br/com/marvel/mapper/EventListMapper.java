package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.EventListResponse;
import br.com.marvel.domain.model.EventList;

public class EventListMapper {

	public static List<EventListResponse> createEventListResponseList(List<EventList> listEventList) {
		List<EventListResponse> eventListResponseList = new ArrayList<EventListResponse>();

		listEventList.forEach(eventList -> {
			eventListResponseList.add(createEventListResponse(eventList));
		});

		return eventListResponseList;
	}

	public static EventListResponse createEventListResponse(EventList eventList) {
		EventListResponse eventListResponse = new EventListResponse ();

		eventListResponse.setAvailable(String.valueOf( eventList.getAvailable()));
		eventListResponse.setReturned(String.valueOf(eventList.getReturned()));
		eventListResponse.setCollectionUri(eventList.getCollectionUri());
		eventListResponse.setListEventSummaryResponse(EventSummaryMapper.createEventSummaryResponseList(eventList.getListEventSummary()));

		return eventListResponse;
	}
}
