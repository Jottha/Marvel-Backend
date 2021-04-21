package br.com.marvel.domain.dto;

import java.io.Serializable;

public class ImageResponse implements Serializable {

	private static final long serialVersionUID = 3849710473704880109L;

	private String path;

	private String extension;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
}
