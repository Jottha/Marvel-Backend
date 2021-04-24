package br.com.marvel.persistence.comic;

import java.util.List;

import br.com.marvel.domain.model.Comic;

public interface ComicListRepositoryCustom {

	List<Comic> listComicByIdCharacterDataWrapper(Long idCharacter);
}
