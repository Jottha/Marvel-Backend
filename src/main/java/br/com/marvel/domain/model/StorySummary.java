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
@Table(name = "tb_story_summary")
public class StorySummary implements Serializable {

	private static final long serialVersionUID = 2783882569189766610L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//The path to the individual story resource.,
	@Column(name = "resource_uri")
	private String resourceUri;

	//The canonical name of the story.,
	@Column(name = "name")
	private String name;

	//The type of the story (interior or cover).
	@Column(name = "type")
	private String type;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "story_list_id")
	private StoryList storyList;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "character_list_id")
	private Character characterList;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public StoryList getStoryList() {
		return storyList;
	}

	public void setStoryList(StoryList storyList) {
		this.storyList = storyList;
	}
	
	public Character getCharacterList() {
		return characterList;
	}

	public void setCharacterList(Character characterList) {
		this.characterList = characterList;
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
		if (!(obj instanceof StorySummary)) {
			return false;
		}
		StorySummary other = (StorySummary) obj;
		return Objects.equals(id, other.id);
	}
}
