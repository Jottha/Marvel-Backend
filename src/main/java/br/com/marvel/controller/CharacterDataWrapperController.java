package br.com.marvel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.marvel.domain.dto.CharacterDataWrapperResponse;
import br.com.marvel.domain.dto.ComicListResponse;
import br.com.marvel.domain.dto.EventListResponse;
import br.com.marvel.domain.dto.SeriesListResponse;
import br.com.marvel.domain.dto.StoryListResponse;
import br.com.marvel.service.CharacterDataWrapperService;

@RestController
@RequestMapping("/v1/public")
@CrossOrigin
public class CharacterDataWrapperController {

	@Autowired
	private CharacterDataWrapperService characterDataWrapperService;

	@GetMapping(value = "/characters", produces = "Get a Characters List")
	public List<CharacterDataWrapperResponse> list() {

		return this.characterDataWrapperService.listCharacterDataWrapperResponse();
	}

	@GetMapping(value = "/characters/{characterId}", produces = "Get Character By Id")
	public CharacterDataWrapperResponse findCharacterById(@RequestParam(name = "id") Long id) {

		return this.characterDataWrapperService.findCharacterDataWrapperResponseById(id);
	}

	@GetMapping(value = "/characters/{characterId}/comics", produces = "Get a Comics List By ")
	public List<ComicListResponse> listComicsByIdCharacter(@RequestParam(name = "id") Long id) {

		return this.characterDataWrapperService.listComicListResponseByIdCharacterDataWrapper(id);
	}

	@GetMapping(value = "/characters/{characterId}/events", produces = "Get a Characters List")
	public List<EventListResponse> listEventsByIdCharacter(@RequestParam(name = "id") Long id) {

		return this.characterDataWrapperService.listEventListResponseByIdCharacterDataWrapper(id);
	}

	@GetMapping(value = "/characters/{characterId}/series", produces = "Get a Characters List")
	public List<SeriesListResponse> listSeriesByIdCharacter(@RequestParam(name = "id") Long id) {

		return this.characterDataWrapperService.listSeriesListResponseByIdCharacterDataWrapper(id);
	}

	@GetMapping(value = "/characters/{characterId}/stories", produces = "Get a Characters List")
	public List<StoryListResponse> listStoriesByIdCharacter(@RequestParam(name = "id") Long id) {

		return this.characterDataWrapperService.listStoryListResponseByIdCharacterDataWrapper(id);
	}

}
