package br.com.marvel.persistence.characterdatawrapper;

import java.util.List;

import br.com.marvel.commos.FilterRequest;
import br.com.marvel.commos.PaginationRequest;
import br.com.marvel.domain.dto.request.CharacterDataWrapperRequest;
import br.com.marvel.domain.model.CharacterDataWrapper;

public interface CharacterDataWrapperRepositoryCustom {

	List<CharacterDataWrapper> getListByFilterWithPagination(FilterRequest<CharacterDataWrapperRequest> characterDataWrapperRequest, PaginationRequest pagination);

	Long getCountListByFilterWithPagination();
}
