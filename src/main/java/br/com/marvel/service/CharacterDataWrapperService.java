package br.com.marvel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.marvel.domain.model.CharacterDataWrapper;

@Component
public interface CharacterDataWrapperService {

	List<CharacterDataWrapper> listCharacterDataWrapper();
}
