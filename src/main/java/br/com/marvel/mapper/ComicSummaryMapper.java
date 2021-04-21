package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.ComicSummaryResponse;
import br.com.marvel.domain.model.ComicSummary;

public class ComicSummaryMapper {

	public static List<ComicSummaryResponse> createComicSummaryResponseList(List<ComicSummary> listComicSummary) {
		List<ComicSummaryResponse> comicSummaryResponseList = new ArrayList<ComicSummaryResponse>();

		listComicSummary.forEach(comicSummary -> {
			comicSummaryResponseList.add(createComicSummaryResponse(comicSummary));
		});

		return comicSummaryResponseList;
	}

	public static ComicSummaryResponse createComicSummaryResponse(ComicSummary comicSummary) {
		ComicSummaryResponse comicSummaryResponse = new ComicSummaryResponse ();

		comicSummaryResponse.setResourceUri(comicSummary.getResourceUri());
		comicSummaryResponse.setName(comicSummary.getName());

		return comicSummaryResponse;
	}
}
