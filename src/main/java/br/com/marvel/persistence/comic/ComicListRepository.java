package br.com.marvel.persistence.comic;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.Comic;

public interface ComicListRepository extends JpaRepository<Comic, Long>, ComicListRepositoryCustom {

	List<Comic> findAllByCharacter(Long characterId);
}
