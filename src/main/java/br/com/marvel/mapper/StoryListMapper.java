package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.StoryResponse;
import br.com.marvel.domain.model.Story;

public class StoryListMapper {

	public static List<StoryResponse> createStoryListResponseList(List<Story> listStoryList) {
		List<StoryResponse> storyListResponseList = new ArrayList<StoryResponse>();

		listStoryList.forEach(storyList -> {
			storyListResponseList.add(createStoryListResponse(storyList));
		});

		return storyListResponseList;
	}

	public static StoryResponse createStoryListResponse(Story storyList) {
		StoryResponse storyListResponse = new StoryResponse ();

		storyListResponse.setAvailable(String.valueOf(storyList.getAvailable()));
		storyListResponse.setReturned(String.valueOf(storyList.getReturned()));
		storyListResponse.setCollectionUri(storyList.getCollectionUri());
		storyListResponse.setListStorySummaryResponse(StorySummaryMapper.createStorySummaryResponseList(storyList.getListStorySummary()));

		return storyListResponse;
	}
}
