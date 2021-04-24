package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.ComicResponse;
import br.com.marvel.domain.model.Comic;

public class ComicListMapper {

	public static List<ComicResponse> createComicListResponseList(List<Comic> listComicList) {
		List<ComicResponse> comicListResponseList = new ArrayList<ComicResponse>();

		listComicList.forEach(comicList -> {
			comicListResponseList.add(createComicListResponse(comicList));
		});

		return comicListResponseList;
	}

	public static ComicResponse createComicListResponse(Comic comicList) {
		ComicResponse comicListResponse = new ComicResponse ();

		comicListResponse.setAvailable(String.valueOf(comicList.getAvailable()));
		comicListResponse.setReturned(String.valueOf(comicList.getReturned()));
		comicListResponse.setCollectionUri(comicList.getCollectionUri());
		comicListResponse.setListComicSummaryResponse(ComicSummaryMapper.createComicSummaryResponseList(comicList.getListComicSummary()));

		return comicListResponse;
	}
}
