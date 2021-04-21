package br.com.marvel.persistence.story;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.StoryList;

public interface StoryListRepository extends JpaRepository<StoryList, Long> {

}
