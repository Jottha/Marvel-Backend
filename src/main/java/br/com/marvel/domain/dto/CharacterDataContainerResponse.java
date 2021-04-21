package br.com.marvel.domain.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.marvel.domain.model.Character;

public class CharacterDataContainerResponse {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The requested offset (number of skipped results) of the call.,
	@Column(name = "offset")
	private int offset;

	//The requested result limit.,
	@Column(name = "limit")
	private int limit;

	//The total number of resources available given the current filter set.,
	@Column(name = "total")
	private int total;

	//The total number of results returned by this call.,
	@Column(name = "count")
	private int count;

	//The list of characters returned by the call.
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "characterDataContainer")
	private List<Character> listCharacterResults;
}
