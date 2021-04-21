package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.SeriesListResponse;
import br.com.marvel.domain.model.SeriesList;

public class SeriesListMapper {

	public static List<SeriesListResponse> createSeriesListResponseList(List<SeriesList> listSeriesList) {
		List<SeriesListResponse> seriesListResponseList = new ArrayList<SeriesListResponse>();

		listSeriesList.forEach(seriesList -> {
			seriesListResponseList.add(createSeriesListResponse(seriesList));
		});

		return seriesListResponseList;
	}

	public static SeriesListResponse createSeriesListResponse(SeriesList seriesList) {
		SeriesListResponse seriesListResponse = new SeriesListResponse ();

		seriesListResponse.setAvailable(String.valueOf(seriesList.getAvailable()));
		seriesListResponse.setReturned(String.valueOf(seriesList.getReturned()));
		seriesListResponse.setCollectionUri(seriesList.getCollectionUri());
		seriesListResponse.setListSeriesSummaryResponse(SeriesSummaryMapper.createSeriesSummaryResponseList(seriesList.getListSeriesSummary()));

		return seriesListResponse;
	}
}
