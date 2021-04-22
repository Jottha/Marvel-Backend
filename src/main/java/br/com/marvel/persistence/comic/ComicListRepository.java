package br.com.marvel.persistence.comic;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.ComicList;

public interface ComicListRepository extends JpaRepository<ComicList, Long>, ComicListRepositoryCustom {

	List<ComicList> findByCharacter(Long characterId);
}
