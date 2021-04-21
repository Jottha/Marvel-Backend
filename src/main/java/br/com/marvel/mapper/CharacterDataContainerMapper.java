package br.com.marvel.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel.domain.dto.CharacterDataContainerResponse;
import br.com.marvel.domain.model.CharacterDataContainer;

public class CharacterDataContainerMapper {

	public static List<CharacterDataContainerResponse> createCharacterDataContainerResponseList(List<CharacterDataContainer> listCharacterDataContainer) {
		List<CharacterDataContainerResponse> characterDataContainerResponseList = new ArrayList<CharacterDataContainerResponse>();

		listCharacterDataContainer.forEach(characterDataContainer -> {
			characterDataContainerResponseList.add(createCharacterDataContainerResponse(characterDataContainer));
		});

		return characterDataContainerResponseList;
	}

	public static CharacterDataContainerResponse createCharacterDataContainerResponse(CharacterDataContainer characterDataContainer ) {
		CharacterDataContainerResponse characterDataContainerResponse = new CharacterDataContainerResponse ();

		characterDataContainerResponse.setOffset(String.valueOf(characterDataContainer.getOffset()));
		characterDataContainerResponse.setLimit(String.valueOf(characterDataContainer.getLimit()));
		characterDataContainerResponse.setTotal(String.valueOf(characterDataContainer.getTotal()));
		characterDataContainerResponse.setCount(String.valueOf(characterDataContainer.getCount()));
		characterDataContainerResponse.setListCharacterResultsResponse(
				CharacterMapper.createCharacterResponseList(characterDataContainer.getListCharacterResults()));
		
		return characterDataContainerResponse;
	}
}
