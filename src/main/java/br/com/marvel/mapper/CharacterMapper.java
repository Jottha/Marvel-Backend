package br.com.marvel.mapper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.CharacterResponse;
import br.com.marvel.domain.model.Character;

public class CharacterMapper {

	public static List<CharacterResponse> createCharacterResponseList(List<Character> listCharacter) {
		List<CharacterResponse> characterResponseList = new ArrayList<CharacterResponse>();

		listCharacter.forEach(character -> {
			characterResponseList.add(createCharacterResponse(character));
		});

		return characterResponseList;
	}

	public static CharacterResponse createCharacterResponse(Character character) {
		CharacterResponse characterResponse = new CharacterResponse ();

		characterResponse.setId(String.valueOf(character.getId()));
		characterResponse.setName(character.getName());
		characterResponse.setDescription(character.getDescription());
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		characterResponse.setModified(formato.format(character.getModified()));
		characterResponse.setResourceUri(character.getResourceUri());
		characterResponse.setListUrlResponse(UrlMapper.createUrlResponseList(character.getListUrl()));
		characterResponse.setImThumbnail(ImageMapper.createImageResponse(character.getImThumbnail()));
		characterResponse.setListComicListResponse(ComicListMapper.createComicListResponseList(character.getListComic()));
		characterResponse.setListStoryListResponse(StoryListMapper.createStoryListResponseList(character.getListStory()));
		characterResponse.setListEventListResponse(EventListMapper.createEventListResponseList(character.getListEvent()));
		characterResponse.setListSeriesListResponse(SeriesListMapper.createSeriesListResponseList(character.getListSeries()));

		return characterResponse;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
