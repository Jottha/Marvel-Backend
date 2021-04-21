package br.com.marvel.domain.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_series_summary")
public class SeriesSummary implements Serializable {
	
	private static final long serialVersionUID = 4704218713195213100L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The path to the individual series resource.,
	@Column(name = "resource_uri")
	private String resourceUri;

	//The canonical name of the series.
	@Column(name = "name")
	private String name;

	//The canonical name of the series.
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "series_list_id")
	private SeriesList seriesList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SeriesList getSeriesList() {
		return seriesList;
	}

	public void setSeriesList(SeriesList seriesList) {
		this.seriesList = seriesList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SeriesSummary)) {
			return false;
		}
		SeriesSummary other = (SeriesSummary) obj;
		return Objects.equals(id, other.id);
	}
}
