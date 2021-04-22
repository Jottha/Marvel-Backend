package br.com.marvel.persistence.series;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.marvel.domain.model.SeriesList;
import br.com.marvel.domain.model.SeriesList_;

public class SeriesListRepositoryImpl implements SeriesListRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<SeriesList> listSeriesByIdCharacterDataWrapper(Long idCharacter) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<SeriesList> criteriaQuery = criteriaBuilder.createQuery(SeriesList.class);
		Root<SeriesList> root = criteriaQuery.from(SeriesList.class);

		Predicate idCharacterRestrinction = criteriaBuilder.equal(root.join(SeriesList_.characterList), idCharacter);

		criteriaQuery.select(root).where(idCharacterRestrinction);

		return  this.em.createQuery(criteriaQuery).getResultList();
	}
}
