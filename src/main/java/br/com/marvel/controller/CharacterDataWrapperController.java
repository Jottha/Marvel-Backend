package br.com.marvel.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.marvel.commos.FilterRequest;
import br.com.marvel.commos.PaginationRequest;
import br.com.marvel.domain.dto.CharacterDataWrapperResponse;
import br.com.marvel.domain.dto.ComicResponse;
import br.com.marvel.domain.dto.EventResponse;
import br.com.marvel.domain.dto.SeriesResponse;
import br.com.marvel.domain.dto.StoryResponse;
import br.com.marvel.domain.dto.request.CharacterDataWrapperRequest;
import br.com.marvel.service.CharacterDataWrapperService;

@RestController
@RequestMapping("/api/v1/public")
@CrossOrigin
public class CharacterDataWrapperController {

	@Autowired
	private CharacterDataWrapperService characterDataWrapperService;
	
	@GetMapping(value = "/characters", produces = "application/json")
	public List<CharacterDataWrapperResponse> list(
			@RequestParam(name = "strSearch", required = false) String name,          
			@RequestParam(name = "strSearch", required = false) String nameStartsWith,
			@RequestParam(name = "strSearch", required = false) Date modifiedSince,   
			@RequestParam(name = "strSearch", required = false) List<Long> comics,    
			@RequestParam(name = "strSearch", required = false) List<Long> series,    
			@RequestParam(name = "strSearch", required = false) List<Long> events,    
			@RequestParam(name = "strSearch", required = false) List<Long> stories,   
			@RequestParam(name = "sortByAttribute", required = false) String sortByAttribute,
			@RequestParam(name = "page", required = false) Integer page,
			@RequestParam(name = "pageSize", required = false) Integer pageSize
			) {
		FilterRequest<CharacterDataWrapperRequest> characterDataWrapperRequest = new FilterRequest<CharacterDataWrapperRequest>(name, nameStartsWith, modifiedSince, comics, series, events, stories);
		PaginationRequest pagination = new PaginationRequest(page, pageSize);
		characterDataWrapperRequest.setData(new CharacterDataWrapperRequest(name, nameStartsWith, modifiedSince, comics, series, events, stories, sortByAttribute));
			
		return this.characterDataWrapperService.listCharacterDataWrapperResponse(characterDataWrapperRequest, pagination);
	}

	@GetMapping(value = "/characters/{characterId}", produces = "application/json")
	public CharacterDataWrapperResponse findCharacterById(@RequestParam(name = "id") Long id) {

		return this.characterDataWrapperService.findCharacterDataWrapperResponseById(id);
	}

	@GetMapping(value = "/characters/{characterId}/comics", produces = "application/json")
	public List<ComicResponse> listComicsByIdCharacter(@RequestParam(name = "id") Long id) {

		return this.characterDataWrapperService.listComicListResponseByIdCharacterDataWrapper(id);
	}

	@GetMapping(value = "/characters/{characterId}/events", produces = "application/json")
	public List<EventResponse> listEventsByIdCharacter(@RequestParam(name = "id") Long id) {

		return this.characterDataWrapperService.listEventListResponseByIdCharacterDataWrapper(id);
	}

	@GetMapping(value = "/characters/{characterId}/series", produces = "application/json")
	public List<SeriesResponse> listSeriesByIdCharacter(@RequestParam(name = "id") Long id) {

		return this.characterDataWrapperService.listSeriesListResponseByIdCharacterDataWrapper(id);
	}

	@GetMapping(value = "/characters/{characterId}/stories", produces = "application/json")
	public List<StoryResponse> listStoriesByIdCharacter(@RequestParam(name = "id") Long id) {

		return this.characterDataWrapperService.listStoryListResponseByIdCharacterDataWrapper(id);
	}
}
