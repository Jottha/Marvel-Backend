package br.com.marvel.persistence.comic;

import java.util.List;

import br.com.marvel.domain.model.ComicList;

public interface ComicListRepositoryCustom {

	List<ComicList> listComicByIdCharacterDataWrapper(Long idCharacter);
}
