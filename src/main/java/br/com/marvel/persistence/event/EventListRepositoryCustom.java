package br.com.marvel.persistence.event;

import java.util.List;

import br.com.marvel.domain.model.Event;

public interface EventListRepositoryCustom {

	List<Event> listEventByIdCharacterDataWrapper(Long idCharacter);
}
