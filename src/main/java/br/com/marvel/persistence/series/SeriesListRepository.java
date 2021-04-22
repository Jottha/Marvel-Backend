package br.com.marvel.persistence.series;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.SeriesList;

public interface SeriesListRepository extends JpaRepository<SeriesList, Long> {

	List<SeriesList> findAllByCharacter(Long characterId);
}
