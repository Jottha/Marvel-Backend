package br.com.marvel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marvel.commos.FilterRequest;
import br.com.marvel.commos.PaginationRequest;
import br.com.marvel.domain.dto.CharacterDataWrapperResponse;
import br.com.marvel.domain.dto.ComicResponse;
import br.com.marvel.domain.dto.EventResponse;
import br.com.marvel.domain.dto.SeriesResponse;
import br.com.marvel.domain.dto.StoryResponse;
import br.com.marvel.domain.dto.request.CharacterDataWrapperRequest;
import br.com.marvel.mapper.CharacterDataWrapperMapper;
import br.com.marvel.mapper.ComicListMapper;
import br.com.marvel.mapper.EventListMapper;
import br.com.marvel.mapper.SeriesListMapper;
import br.com.marvel.mapper.StoryListMapper;
import br.com.marvel.persistence.characterdatawrapper.CharacterDataWrapperRepository;
import br.com.marvel.persistence.comic.ComicListRepository;
import br.com.marvel.persistence.event.EventListRepository;
import br.com.marvel.persistence.series.SeriesListRepository;
import br.com.marvel.persistence.story.StoryListRepository;
import br.com.marvel.service.CharacterDataWrapperService;

@Service
public class CharacterDataWrapperServiceImpl implements CharacterDataWrapperService {

	@Autowired
	private CharacterDataWrapperRepository characterDataWrapperRepository;

	@Autowired
	private ComicListRepository comicListRepository;

	@Autowired
	private EventListRepository eventListRepository;

	@Autowired
	private SeriesListRepository seriesListRepository;

	@Autowired
	private StoryListRepository storyListRepository;

	@Override
	public List<CharacterDataWrapperResponse> listCharacterDataWrapperResponse(FilterRequest<CharacterDataWrapperRequest> characterDataWrapperRequest, PaginationRequest pagination) {
		
		return CharacterDataWrapperMapper.createCharacterDataWrapperResponseList(this.characterDataWrapperRepository.getListByFilterWithPagination(characterDataWrapperRequest, pagination));
	}

	@Override
	public CharacterDataWrapperResponse findCharacterDataWrapperResponseById(Long id) {
		return CharacterDataWrapperMapper.createCharacterDataWrapperResponse(this.characterDataWrapperRepository.findById(id).get());
	}

	@Override
	public List<ComicResponse> listComicListResponseByIdCharacterDataWrapper(Long id) {
		return ComicListMapper.createComicListResponseList(this.comicListRepository.findAllByCharacter(id));
	}

	@Override
	public List<EventResponse> listEventListResponseByIdCharacterDataWrapper(Long id) {
		return EventListMapper.createEventListResponseList(this.eventListRepository.findAllByCharacter(id));
	}

	@Override
	public List<SeriesResponse> listSeriesListResponseByIdCharacterDataWrapper(Long id) {
		return SeriesListMapper.createSeriesListResponseList(this.seriesListRepository.findAllByCharacter(id));
	}

	@Override
	public List<StoryResponse> listStoryListResponseByIdCharacterDataWrapper(Long id) {
		return StoryListMapper.createStoryListResponseList(this.storyListRepository.findAllByCharacter(id));
	}
}
