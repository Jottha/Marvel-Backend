package br.com.marvel.persistence.series;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.marvel.domain.model.Series;
import br.com.marvel.domain.model.Series_;

public class SeriesListRepositoryImpl implements SeriesListRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Series> listSeriesByIdCharacterDataWrapper(Long idCharacter) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Series> criteriaQuery = criteriaBuilder.createQuery(Series.class);
		Root<Series> root = criteriaQuery.from(Series.class);

		Predicate idCharacterRestrinction = criteriaBuilder.equal(root.join(Series_.character), idCharacter);

		criteriaQuery.select(root).where(idCharacterRestrinction);

		return  this.em.createQuery(criteriaQuery).getResultList();
	}
}
