package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.SeriesSummaryResponse;
import br.com.marvel.domain.model.SeriesSummary;

public class SeriesSummaryMapper {

	public static List<SeriesSummaryResponse> createSeriesSummaryResponseList(List<SeriesSummary> listSeriesSummary) {
		List<SeriesSummaryResponse> seriesSummaryResponseList = new ArrayList<SeriesSummaryResponse>();

		listSeriesSummary.forEach(SeriesSummary -> {
			seriesSummaryResponseList.add(createSeriesSummaryResponse(SeriesSummary));
		});

		return seriesSummaryResponseList;
	}

	public static SeriesSummaryResponse createSeriesSummaryResponse(SeriesSummary seriesSummary) {
		SeriesSummaryResponse seriesSummaryResponse = new SeriesSummaryResponse ();

		seriesSummaryResponse.setResourceUri(seriesSummary.getResourceUri());
		seriesSummaryResponse.setName(seriesSummary.getName());

		return seriesSummaryResponse;
	}
}
