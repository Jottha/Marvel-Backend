package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.StoryListResponse;
import br.com.marvel.domain.model.StoryList;

public class StoryListMapper {

	public static List<StoryListResponse> createStoryListResponseList(List<StoryList> listStoryList) {
		List<StoryListResponse> storyListResponseList = new ArrayList<StoryListResponse>();

		listStoryList.forEach(storyList -> {
			storyListResponseList.add(createStoryListResponse(storyList));
		});

		return storyListResponseList;
	}

	public static StoryListResponse createStoryListResponse(StoryList storyList) {
		StoryListResponse storyListResponse = new StoryListResponse ();

		storyListResponse.setAvailable(String.valueOf(storyList.getAvailable()));
		storyListResponse.setReturned(String.valueOf(storyList.getReturned()));
		storyListResponse.setCollectionUri(storyList.getCollectionUri());
		storyListResponse.setListStorySummaryResponse(StorySummaryMapper.createStorySummaryResponseList(storyList.getListStorySummary()));

		return storyListResponse;
	}
}
