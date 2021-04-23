package br.com.marvel.persistence.story;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.Story;

public interface StoryListRepository extends JpaRepository<Story, Long> {

	List<Story> findAllByCharacter(Long characterId);
}
