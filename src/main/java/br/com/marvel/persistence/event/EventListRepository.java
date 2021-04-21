package br.com.marvel.persistence.event;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.EventList;

public interface EventListRepository extends JpaRepository<EventList, Long> {

}
