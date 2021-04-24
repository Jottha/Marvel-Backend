package br.com.marvel.persistence.event;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.Event;

public interface EventListRepository extends JpaRepository<Event, Long> {

	List<Event> findAllByCharacter(Long characterId);
}
