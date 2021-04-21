package br.com.marvel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marvel.domain.model.CharacterDataWrapper;
import br.com.marvel.persistence.CharacterDataWrapperRepository;
import br.com.marvel.service.CharacterDataWrapperService;

@Service
public class CharacterDataWrapperServiceImpl implements CharacterDataWrapperService {

	@Autowired
	private CharacterDataWrapperRepository characterDataWrapperRepository;

	@Override
	public List<CharacterDataWrapper> listCharacterDataWrapper() {
		this.characterDataWrapperRepository.findAll();
		return null;
	}

}
