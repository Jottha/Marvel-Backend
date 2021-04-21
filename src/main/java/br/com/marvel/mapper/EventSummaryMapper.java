package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.EventSummaryResponse;
import br.com.marvel.domain.model.EventSummary;

public class EventSummaryMapper {

	public static List<EventSummaryResponse> createEventSummaryResponseList(List<EventSummary> listEventSummary) {
		List<EventSummaryResponse> eventSummaryResponseList = new ArrayList<EventSummaryResponse>();

		listEventSummary.forEach(eventSummary -> {
			eventSummaryResponseList.add(createEventSummaryResponse(eventSummary));
		});

		return eventSummaryResponseList;
	}

	public static EventSummaryResponse createEventSummaryResponse(EventSummary eventSummary) {
		EventSummaryResponse eventSummaryResponse = new EventSummaryResponse ();

		eventSummary.setResourceUri(eventSummary.getResourceUri());
		eventSummary.setName(eventSummary.getName());

		return eventSummaryResponse;
	}
}
