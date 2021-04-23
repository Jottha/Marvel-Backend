package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.SeriesResponse;
import br.com.marvel.domain.model.Series;

public class SeriesListMapper {

	public static List<SeriesResponse> createSeriesListResponseList(List<Series> listSeriesList) {
		List<SeriesResponse> seriesListResponseList = new ArrayList<SeriesResponse>();

		listSeriesList.forEach(seriesList -> {
			seriesListResponseList.add(createSeriesListResponse(seriesList));
		});

		return seriesListResponseList;
	}

	public static SeriesResponse createSeriesListResponse(Series seriesList) {
		SeriesResponse seriesListResponse = new SeriesResponse ();

		seriesListResponse.setAvailable(String.valueOf(seriesList.getAvailable()));
		seriesListResponse.setReturned(String.valueOf(seriesList.getReturned()));
		seriesListResponse.setCollectionUri(seriesList.getCollectionUri());
		seriesListResponse.setListSeriesSummaryResponse(SeriesSummaryMapper.createSeriesSummaryResponseList(seriesList.getListSeriesSummary()));

		return seriesListResponse;
	}
}
