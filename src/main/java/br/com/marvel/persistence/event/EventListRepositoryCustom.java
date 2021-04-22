package br.com.marvel.persistence.event;

import java.util.List;

import br.com.marvel.domain.model.EventList;

public interface EventListRepositoryCustom {

	List<EventList> listEventByIdCharacterDataWrapper(Long idCharacter);
}
