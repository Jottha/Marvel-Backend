package br.com.marvel.domain.model;

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
@Table(name = "tb_character_data_container")
public class CharacterDataContainer implements Serializable {

	private static final long serialVersionUID = 6468972779438894291L;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Character> getListCharacterResults() {
		return listCharacterResults;
	}

	public void setListCharacterResults(List<Character> listCharacterResults) {
		this.listCharacterResults = listCharacterResults;
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
		if (!(obj instanceof CharacterDataContainer)) {
			return false;
		}
		CharacterDataContainer other = (CharacterDataContainer) obj;
		return Objects.equals(id, other.id);
	}
}
