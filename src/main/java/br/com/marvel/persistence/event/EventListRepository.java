package br.com.marvel.persistence.event;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.EventList;

public interface EventListRepository extends JpaRepository<EventList, Long> {

	List<EventList> findByCharacter(Long characterId);
}
