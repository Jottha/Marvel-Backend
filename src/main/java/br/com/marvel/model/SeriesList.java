package br.com.marvel.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "series")
public class SeriesList implements Serializable {

	private static final long serialVersionUID = 6927078413440504928L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The number of total available series in this list.
	// Will always be greater than or equal to the "returned" value.,
	@Column(name = "total_available")
	private int available; 

	//The number of series returned in this collection (up to 20).,
	@Column(name = "returned")
	private int returned;

	//The path to the full list of series in this collection.,
	@Column(name = "collection_uri")
	private String collectionUri;

	//items (Array[SeriesSummary], optional): 
	//The list of returned series in this collection.
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seriesList")
	private List<SeriesSummary> listSeriesSummary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public int getReturned() {
		return returned;
	}

	public void setReturned(int returned) {
		this.returned = returned;
	}

	public String getCollectionUri() {
		return collectionUri;
	}

	public void setCollectionUri(String collectionUri) {
		this.collectionUri = collectionUri;
	}

	public List<SeriesSummary> getListSeriesSummary() {
		return listSeriesSummary;
	}

	public void setListSeriesSummary(List<SeriesSummary> listSeriesSummary) {
		this.listSeriesSummary = listSeriesSummary;
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
		if (!(obj instanceof SeriesList)) {
			return false;
		}
		SeriesList other = (SeriesList) obj;
		return Objects.equals(id, other.id);
	}
}
