package br.com.marvel.persistence.story;

import java.util.List;

import br.com.marvel.domain.model.Story;

public interface StoryListRepositoryCustom {

	List<Story> listStoryByIdCharacterDataWrapper(Long idCharacter);
}
