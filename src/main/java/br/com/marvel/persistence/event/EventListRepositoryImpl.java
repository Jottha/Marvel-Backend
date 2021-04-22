package br.com.marvel.persistence.event;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.marvel.domain.model.EventList;
import br.com.marvel.domain.model.EventList_;

public class EventListRepositoryImpl implements EventListRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<EventList> listEventByIdCharacterDataWrapper(Long idCharacter) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<EventList> criteriaQuery = criteriaBuilder.createQuery(EventList.class);
		Root<EventList> root = criteriaQuery.from(EventList.class);

		Predicate idCharacterRestrinction = criteriaBuilder.equal(root.join(EventList_.characterList), idCharacter);

		criteriaQuery.select(root).where(idCharacterRestrinction);

		return  this.em.createQuery(criteriaQuery).getResultList();
	}
}
