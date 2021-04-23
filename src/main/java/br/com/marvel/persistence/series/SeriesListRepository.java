package br.com.marvel.persistence.series;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.Series;

public interface SeriesListRepository extends JpaRepository<Series, Long> {

	List<Series> findAllByCharacter(Long characterId);
}
