package br.com.marvel.persistence.comic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.marvel.domain.model.ComicList;
import br.com.marvel.domain.model.ComicList_;

public class ComicListRepositoryImpl implements ComicListRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<ComicList> listComicByIdCharacterDataWrapper(Long idCharacter) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<ComicList> criteriaQuery = criteriaBuilder.createQuery(ComicList.class);
		Root<ComicList> root = criteriaQuery.from(ComicList.class);

		Predicate idCharacterRestrinction = criteriaBuilder.equal(root.join(ComicList_.character), idCharacter);

		criteriaQuery.select(root).where(idCharacterRestrinction);

		return  this.em.createQuery(criteriaQuery).getResultList();
	}
}
