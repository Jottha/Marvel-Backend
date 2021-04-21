package br.com.marvel.domain.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ImageResponse {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The directory path of to the image.,
	@Column(name = "path")
	private String path;

	//The file extension for the image.
	@Column(name = "extension")
	private String extension;
}
