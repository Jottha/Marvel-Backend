package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.UrlResponse;
import br.com.marvel.domain.model.Url;

public class UrlMapper {

	public static List<UrlResponse> createUrlResponseList(List<Url> listUrl) {
		List<UrlResponse> urlResponseList = new ArrayList<UrlResponse>();

		listUrl.forEach(url -> {
			urlResponseList.add(createUrlResponse(url));
		});

		return urlResponseList;
	}

	public static UrlResponse createUrlResponse(Url url) {
		UrlResponse urlResponse = new UrlResponse ();

		urlResponse.setType(url.getType());
		urlResponse.setUrl(url.getUrl());

		return urlResponse;
	}
}
