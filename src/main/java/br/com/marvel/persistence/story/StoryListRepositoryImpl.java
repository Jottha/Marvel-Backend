package br.com.marvel.persistence.story;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.marvel.domain.model.StoryList;
import br.com.marvel.domain.model.StoryList_;

public class StoryListRepositoryImpl implements StoryListRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<StoryList> listStoryByIdCharacterDataWrapper(Long idCharacter) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<StoryList> criteriaQuery = criteriaBuilder.createQuery(StoryList.class);
		Root<StoryList> root = criteriaQuery.from(StoryList.class);

		Predicate idCharacterRestrinction = criteriaBuilder.equal(root.join(StoryList_.characterList), idCharacter);

		criteriaQuery.select(root).where(idCharacterRestrinction);

		return  this.em.createQuery(criteriaQuery).getResultList();
	}
}
