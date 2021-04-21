package br.com.marvel.persistence.comic;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.ComicList;

public interface ComicListRepository extends JpaRepository<ComicList, Long> {

}
