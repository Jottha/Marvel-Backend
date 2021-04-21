package br.com.marvel.domain.dto;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.marvel.domain.model.ComicList;

public class ComicSummaryResponse {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The path to the individual comic resource.,
	@Column(name = "resource_uri")
	private String resourceUri;

	//The canonical name of the comic.
	@Column(name = "name")
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "comic_list_id")
	private ComicList comicList;
}
