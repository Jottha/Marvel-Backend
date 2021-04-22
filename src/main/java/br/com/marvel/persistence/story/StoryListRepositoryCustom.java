package br.com.marvel.persistence.story;

import java.util.List;

import br.com.marvel.domain.model.StoryList;

public interface StoryListRepositoryCustom {

	List<StoryList> listStoryByIdCharacterDataWrapper(Long idCharacter);
}
