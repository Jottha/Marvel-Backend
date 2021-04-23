package br.com.marvel.persistence.comic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.marvel.domain.model.Comic;
import br.com.marvel.domain.model.Comic_;

public class ComicListRepositoryImpl implements ComicListRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Comic> listComicByIdCharacterDataWrapper(Long idCharacter) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Comic> criteriaQuery = criteriaBuilder.createQuery(Comic.class);
		Root<Comic> root = criteriaQuery.from(Comic.class);

		Predicate idCharacterRestrinction = criteriaBuilder.equal(root.join(Comic_.character), idCharacter);

		criteriaQuery.select(root).where(idCharacterRestrinction);

		return  this.em.createQuery(criteriaQuery).getResultList();
	}
}
