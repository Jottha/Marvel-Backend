package br.com.marvel.domain.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_character")
public class Character implements Serializable {

	private static final long serialVersionUID = -8500524907072604640L;

	//The unique ID of the character resource.,
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The name of the character.,
	@Column(name = "name")
	private String name; 

	//A short bio or description of the character.,
	@Column(name = "description")
	private String description;

	//The date the resource was most recently modified.,
	@Column(name = "changed_in")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modified;

	//The canonical URL identifier for this resource.,
	@Column(name = "resource_uri")
	private String resourceUri;

	//A set of public web site URLs for the resource.,
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
	private List<Url> listUrl;

	//The representative image for this character.,
	@OneToOne
	@JoinColumn(name = "im_thumbnail")
	private Image imThumbnail;

	//A resource list containing comics which feature this character.,
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
	private List<Comic> listComic;

	//A resource list of stories in which this character appears.,
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
	private List<Story> listStory;

	//A resource list of events in which this character appears.,
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
	private List<Event> listEvent;

	//A resource list of series in which this character appears.
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
	private List<Series> listSeries;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "character_data_container_id")
	private CharacterDataContainer characterDataContainer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public List<Url> getListUrl() {
		return listUrl;
	}

	public void setListUrl(List<Url> listUrl) {
		this.listUrl = listUrl;
	}

	public Image getImThumbnail() {
		return imThumbnail;
	}

	public void setImThumbnail(Image imThumbnail) {
		this.imThumbnail = imThumbnail;
	}

	public List<Comic> getListComic() {
		return listComic;
	}

	public void setListComic(List<Comic> listComic) {
		this.listComic = listComic;
	}

	public List<Story> getListStory() {
		return listStory;
	}

	public void setListStory(List<Story> listStory) {
		this.listStory = listStory;
	}

	public List<Event> getListEvent() {
		return listEvent;
	}

	public void setListEvent(List<Event> listEvent) {
		this.listEvent = listEvent;
	}

	public List<Series> getListSeries() {
		return listSeries;
	}

	public void setListSeries(List<Series> listSeries) {
		this.listSeries = listSeries;
	}

	public CharacterDataContainer getCharacterDataContainer() {
		return characterDataContainer;
	}

	public void setCharacterDataContainer(CharacterDataContainer characterDataContainer) {
		this.characterDataContainer = characterDataContainer;
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
		if (!(obj instanceof Character)) {
			return false;
		}
		Character other = (Character) obj;
		return Objects.equals(id, other.id);
	}
}
