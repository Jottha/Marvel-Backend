package br.com.marvel.persistence.story;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.StoryList;

public interface StoryListRepository extends JpaRepository<StoryList, Long> {

	List<StoryList> findAllByCharacter(Long characterId);
}
