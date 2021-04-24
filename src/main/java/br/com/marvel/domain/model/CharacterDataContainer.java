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
import javax.persistence.OneToOne;
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
	private Long offset;

	//The requested result limit.,
	@Column(name = "limit")
	private Long limit;

	//The total number of resources available given the current filter set.,
	@Column(name = "total")
	private Long total;

	//The total number of results returned by this call.,
	@Column(name = "count")
	private Long count;

	//The list of characters returned by the call.
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "characterDataContainer")
	private List<Character> listCharacterResults;

	@OneToOne(mappedBy = "characterDataContainer")
	private CharacterDataWrapper characterDataWrapper;

	public Long getId() {
		return id;
	}

	public Long getOffset() {
		return offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Character> getListCharacterResults() {
		return listCharacterResults;
	}

	public void setListCharacterResults(List<Character> listCharacterResults) {
		this.listCharacterResults = listCharacterResults;
	}
	
	public CharacterDataWrapper getCharacterDataWrapper() {
		return characterDataWrapper;
	}

	public void setCharacterDataWrapper(CharacterDataWrapper characterDataWrapper) {
		this.characterDataWrapper = characterDataWrapper;
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
