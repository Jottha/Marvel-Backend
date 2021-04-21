package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.StorySummaryResponse;
import br.com.marvel.domain.model.StorySummary;

public class StorySummaryMapper {

	public static List<StorySummaryResponse> createStorySummaryResponseList(List<StorySummary> listStorySummary) {
		List<StorySummaryResponse> storySummaryResponseList = new ArrayList<StorySummaryResponse>();

		listStorySummary.forEach(storySummary -> {
			storySummaryResponseList.add(createStorySummaryResponse(storySummary));
		});

		return storySummaryResponseList;
	}

	public static StorySummaryResponse createStorySummaryResponse(StorySummary storySummary) {
		StorySummaryResponse storySummaryResponse = new StorySummaryResponse ();

		storySummaryResponse.setResourceUri(storySummary.getResourceUri());
		storySummaryResponse.setName(storySummary.getName());
		storySummaryResponse.setType(storySummary.getType());

		return storySummaryResponse;
	}
}
