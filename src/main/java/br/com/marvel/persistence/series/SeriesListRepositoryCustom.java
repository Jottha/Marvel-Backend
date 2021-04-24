package br.com.marvel.persistence.series;

import java.util.List;

import br.com.marvel.domain.model.Series;

public interface SeriesListRepositoryCustom {

	List<Series> listSeriesByIdCharacterDataWrapper(Long idCharacter);
}
