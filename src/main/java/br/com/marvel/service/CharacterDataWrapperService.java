package br.com.marvel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.marvel.domain.dto.CharacterDataWrapperResponse;
import br.com.marvel.domain.dto.ComicResponse;
import br.com.marvel.domain.dto.EventResponse;
import br.com.marvel.domain.dto.SeriesResponse;
import br.com.marvel.domain.dto.StoryResponse;

@Component
public interface CharacterDataWrapperService {

	List<CharacterDataWrapperResponse> listCharacterDataWrapperResponse();

	CharacterDataWrapperResponse findCharacterDataWrapperResponseById(Long id);

	List<ComicResponse> listComicListResponseByIdCharacterDataWrapper(Long id);

	List<EventResponse> listEventListResponseByIdCharacterDataWrapper(Long id);

	List<SeriesResponse> listSeriesListResponseByIdCharacterDataWrapper(Long id);

	List<StoryResponse> listStoryListResponseByIdCharacterDataWrapper(Long id);
	
}
