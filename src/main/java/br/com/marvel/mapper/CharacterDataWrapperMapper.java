package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.CharacterDataWrapperResponse;
import br.com.marvel.domain.model.CharacterDataWrapper;

public class CharacterDataWrapperMapper {

	public static List<CharacterDataWrapperResponse> createCharacterDataWrapperResponseList(List<CharacterDataWrapper> listCharacterDataWrapper) {
		List<CharacterDataWrapperResponse> characterDataWrapperResponseList = new ArrayList<CharacterDataWrapperResponse>();

		listCharacterDataWrapper.forEach(characterDataWrapper -> {
			characterDataWrapperResponseList.add(createCharacterDataWrapperResponse(characterDataWrapper));
		});

		return characterDataWrapperResponseList;
	}

	public static CharacterDataWrapperResponse createCharacterDataWrapperResponse(CharacterDataWrapper characterDataWrapper) {
		CharacterDataWrapperResponse characterDataWrapperResponse = new CharacterDataWrapperResponse ();

		characterDataWrapperResponse.setCode(String.valueOf(characterDataWrapper.getCode()));
		characterDataWrapperResponse.setStatus(characterDataWrapper.getStatus());
		characterDataWrapperResponse.setCopyRight(characterDataWrapper.getCopyRight());
		characterDataWrapperResponse.setAttributionText(characterDataWrapper.getAttributionText());
		characterDataWrapperResponse.setAttributionHtml(characterDataWrapper.getAttributionHtml());
		characterDataWrapperResponse.setCharacterDataContainerResponse(
				CharacterDataContainerMapper.createCharacterDataContainerResponse(characterDataWrapper.getCharacterDataContainer()));
		characterDataWrapperResponse.setEtag(characterDataWrapper.getEtag());

		return characterDataWrapperResponse;
	}
}
