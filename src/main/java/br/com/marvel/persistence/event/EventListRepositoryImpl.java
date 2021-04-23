package br.com.marvel.persistence.event;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.marvel.domain.model.Event;
import br.com.marvel.domain.model.Event_;

public class EventListRepositoryImpl implements EventListRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Event> listEventByIdCharacterDataWrapper(Long idCharacter) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Event> criteriaQuery = criteriaBuilder.createQuery(Event.class);
		Root<Event> root = criteriaQuery.from(Event.class);

		Predicate idCharacterRestrinction = criteriaBuilder.equal(root.join(Event_.character), idCharacter);

		criteriaQuery.select(root).where(idCharacterRestrinction);

		return  this.em.createQuery(criteriaQuery).getResultList();
	}
}
