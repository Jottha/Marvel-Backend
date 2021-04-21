package br.com.marvel.domain.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.marvel.domain.model.Character;
import br.com.marvel.domain.model.EventSummary;

public class EventListResponse {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The number of total available events in this list. Will always be greater than or equal to the "returned" value.,
	@Column(name = "total_available")
	private int available;

	//The number of events returned in this collection (up to 20).,
	@Column(name = "returned")
	private int returned;

	//The path to the full list of events in this collection.,
	@Column(name = "collection_uri")
	private String collectionUri;

	//The list of returned series in this collection.
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eventList")
	private List<EventSummary> listEventSummary;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "character_list_id")
	private Character characterList;
}
