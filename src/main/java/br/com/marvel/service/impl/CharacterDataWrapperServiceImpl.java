package br.com.marvel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marvel.domain.dto.CharacterDataWrapperResponse;
import br.com.marvel.domain.dto.ComicListResponse;
import br.com.marvel.domain.dto.EventListResponse;
import br.com.marvel.domain.dto.SeriesListResponse;
import br.com.marvel.domain.dto.StoryListResponse;
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
	public List<CharacterDataWrapperResponse> listCharacterDataWrapperResponse() {
		
		return CharacterDataWrapperMapper.createCharacterDataWrapperResponseList(this.characterDataWrapperRepository.findAll());
	}

	@Override
	public CharacterDataWrapperResponse findCharacterDataWrapperResponseById(Long id) {
		return CharacterDataWrapperMapper.createCharacterDataWrapperResponse(this.characterDataWrapperRepository.findById(id).get());
	}

	@Override
	public List<ComicListResponse> listComicListResponseByIdCharacterDataWrapper(Long id) {
		return ComicListMapper.createComicListResponseList(this.comicListRepository.findAllByCharacter(id));
	}

	@Override
	public List<EventListResponse> listEventListResponseByIdCharacterDataWrapper(Long id) {
		return EventListMapper.createEventListResponseList(this.eventListRepository.findAllByCharacter(id));
	}

	@Override
	public List<SeriesListResponse> listSeriesListResponseByIdCharacterDataWrapper(Long id) {
		return SeriesListMapper.createSeriesListResponseList(this.seriesListRepository.findAllByCharacter(id));
	}

	@Override
	public List<StoryListResponse> listStoryListResponseByIdCharacterDataWrapper(Long id) {
		return StoryListMapper.createStoryListResponseList(this.storyListRepository.findAllByCharacter(id));
	}
}
