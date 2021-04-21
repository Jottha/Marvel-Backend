package br.com.marvel.persistence.series;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marvel.domain.model.SeriesList;

public interface SeriesListRepository extends JpaRepository<SeriesList, Long> {

}
