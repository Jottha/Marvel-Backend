package br.com.marvel.persistence.story;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.marvel.domain.model.Story;
import br.com.marvel.domain.model.Story_;

public class StoryListRepositoryImpl implements StoryListRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Story> listStoryByIdCharacterDataWrapper(Long idCharacter) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Story> criteriaQuery = criteriaBuilder.createQuery(Story.class);
		Root<Story> root = criteriaQuery.from(Story.class);

		Predicate idCharacterRestrinction = criteriaBuilder.equal(root.join(Story_.character), idCharacter);

		criteriaQuery.select(root).where(idCharacterRestrinction);

		return  this.em.createQuery(criteriaQuery).getResultList();
	}
}
