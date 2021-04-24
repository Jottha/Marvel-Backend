package br.com.marvel.persistence.characterdatawrapper;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import br.com.marvel.commos.FilterRequest;
import br.com.marvel.commos.PaginationRequest;
import br.com.marvel.domain.dto.request.CharacterDataWrapperRequest;
import br.com.marvel.domain.model.Character;
import br.com.marvel.domain.model.CharacterDataContainer;
import br.com.marvel.domain.model.CharacterDataContainer_;
import br.com.marvel.domain.model.CharacterDataWrapper;
import br.com.marvel.domain.model.CharacterDataWrapper_;
import br.com.marvel.domain.model.Character_;

public class CharacterDataWrapperRepositoryImpl implements CharacterDataWrapperRepositoryCustom {
	
	private static final String PORCETAGEM = "%";

	@PersistenceContext
	private EntityManager em;

	@Override
	public Page<CharacterDataWrapper> getListByFilterWithPagination(FilterRequest<CharacterDataWrapperRequest> characterDataWrapperRequest, PaginationRequest pagination) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<CharacterDataWrapper> criteriaQuery = criteriaBuilder.createQuery(CharacterDataWrapper.class);
		Root<CharacterDataWrapper> root = criteriaQuery.from(CharacterDataWrapper.class);
		Join<CharacterDataWrapper, CharacterDataContainer> joinDataC = root.join(CharacterDataWrapper_.characterDataContainer, JoinType.INNER);
		Join<CharacterDataContainer, Character> joinC = joinDataC.join(CharacterDataContainer_.listCharacterResults, JoinType.INNER);

		List<Order> orderList = this.mountOrder(characterDataWrapperRequest, root, criteriaBuilder, joinC);
		List<Predicate> restrictions = this.mountFilter(characterDataWrapperRequest, root, criteriaBuilder, joinC);

		criteriaQuery.select(root).where(criteriaBuilder.or(restrictions.toArray(new Predicate[restrictions.size()]))).orderBy(orderList);

		Integer paginacaoAtual = pagination.getPage().getPageNumber() * pagination.getPage().getPageSize();
		Integer itensPorPagina = pagination.getPage().getPageSize();
		TypedQuery<CharacterDataWrapper> typedQuery = this.em.createQuery(criteriaQuery);
		List<CharacterDataWrapper> listCharacterDataWrapper = typedQuery.setFirstResult(paginacaoAtual).setMaxResults(itensPorPagina).getResultList();

		return new PageImpl<>(listCharacterDataWrapper, pagination.getPage(), this.getCountListByFilterWithPagination(characterDataWrapperRequest, pagination));
	}	

	@Override
	public Long getCountListByFilterWithPagination(FilterRequest<CharacterDataWrapperRequest> characterDataWrapperRequest, PaginationRequest pagination) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
		Root<CharacterDataWrapper> root = criteriaQuery.from(CharacterDataWrapper.class);
		Join<CharacterDataWrapper, CharacterDataContainer> joinDataC = root.join(CharacterDataWrapper_.characterDataContainer, JoinType.INNER);
		Join<CharacterDataContainer, Character> joinC = joinDataC.join(CharacterDataContainer_.listCharacterResults, JoinType.INNER);

		List<Predicate> restrictions = this.mountFilter(characterDataWrapperRequest, root, criteriaBuilder, joinC);

		criteriaQuery.multiselect(criteriaBuilder.count(root)).where(restrictions.toArray(new Predicate[restrictions.size()]));

		return em.createQuery(criteriaQuery).getSingleResult();
	}

	private List<Predicate> mountFilter(FilterRequest<CharacterDataWrapperRequest> characterDataWrapperRequest, Root<CharacterDataWrapper> root, CriteriaBuilder criteriaBuilder, Join<CharacterDataContainer, Character> joinC) {
		List<Predicate> restrictions =	new ArrayList<>();

		if (StringUtils.isNotBlank(characterDataWrapperRequest.getData().getName())) {
			//name Return only characters matching the specified full character name (e.g. Spider-Man).
			Predicate restrictionCharacterName = criteriaBuilder.equal(criteriaBuilder.lower(joinC.get(Character_.name)), characterDataWrapperRequest.getData().getName().toLowerCase());
			restrictions.add(restrictionCharacterName);
		}

		if (StringUtils.isNotBlank(characterDataWrapperRequest.getData().getName())) {
			//nameStartsWith Return characters with names that begin with the specified string (e.g. Sp).
			Predicate restrictionCharacterNameStartsWith = criteriaBuilder.like(criteriaBuilder.lower(joinC.get(Character_.name)), characterDataWrapperRequest.getData().getName().toLowerCase().concat(PORCETAGEM));
			restrictions.add(restrictionCharacterNameStartsWith);
		}

		if (characterDataWrapperRequest.getData().getModifiedSince() != null) {
			//modifiedSince Return only characters which have been modified since the specified date.
		
			Predicate restrictionCharacterName = criteriaBuilder.greaterThan(joinC.get(Character_.modified), characterDataWrapperRequest.getData().getModifiedSince());
			restrictions.add(restrictionCharacterName);
		}

		if (characterDataWrapperRequest.getData().getComics() != null) {
			//comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids).
			Predicate restrictionCharacterName = joinC.get(Character_.listComic).in(characterDataWrapperRequest.getData().getComics());
			restrictions.add(restrictionCharacterName);
		}

		if (characterDataWrapperRequest.getData().getComics() != null) {
			//series Return only characters which appear the specified series (accepts a comma-separated list of ids).
			Predicate restrictionCharacterName = joinC.get(Character_.listSeries).in(characterDataWrapperRequest.getData().getComics());
			restrictions.add(restrictionCharacterName);
		}

		if (characterDataWrapperRequest.getData().getComics() != null) {
			//events Return only characters which appear in the specified events (accepts a comma-separated list of ids).
			Predicate restrictionCharacterName = joinC.get(Character_.listEvent).in(characterDataWrapperRequest.getData().getComics());
			restrictions.add(restrictionCharacterName);
		}

		if (characterDataWrapperRequest.getData().getComics() != null) {
			//stories Return only characters which appear the specified stories (accepts a comma-separated list of ids).
			Predicate restrictionCharacterName = joinC.get(Character_.listStory).in(characterDataWrapperRequest.getData().getComics());
			restrictions.add(restrictionCharacterName);
		}

		return restrictions;
	}

	private List<Order> mountOrder(FilterRequest<CharacterDataWrapperRequest> characterDataWrapperRequest, Root<CharacterDataWrapper> root, CriteriaBuilder criteriaBuilder, Join<CharacterDataContainer, Character> joinC) {
		List<Order> listOrder =	new ArrayList<>();
		
		if (characterDataWrapperRequest.getData().getSortByAttribute() != null && characterDataWrapperRequest.getData().getSortByAttribute().equals("name")) {
//			listOrder.add(criteriaBuilder.desc(root.get(Character_.name)));
		}
		//TODO
		return listOrder;
	}
}
