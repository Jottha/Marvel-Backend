package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.ComicListResponse;
import br.com.marvel.domain.model.ComicList;

public class ComicListMapper {

	public static List<ComicListResponse> createComicListResponseList(List<ComicList> listComicList) {
		List<ComicListResponse> comicListResponseList = new ArrayList<ComicListResponse>();

		listComicList.forEach(comicList -> {
			comicListResponseList.add(createComicListResponse(comicList));
		});

		return comicListResponseList;
	}

	public static ComicListResponse createComicListResponse(ComicList comicList) {
		ComicListResponse comicListResponse = new ComicListResponse ();

		comicListResponse.setAvailable(String.valueOf(comicList.getAvailable()));
		comicListResponse.setReturned(String.valueOf(comicList.getReturned()));
		comicListResponse.setCollectionUri(comicList.getCollectionUri());
		comicListResponse.setListComicSummaryResponse(ComicSummaryMapper.createComicSummaryResponseList(comicList.getListComicSummary()));

		return comicListResponse;
	}
}
