package br.com.marvel.persistence.series;

import java.util.List;

import br.com.marvel.domain.model.SeriesList;

public interface SeriesListRepositoryCustom {

	List<SeriesList> listSeriesByIdCharacterDataWrapper(Long idCharacter);
}
