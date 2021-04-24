package br.com.marvel.persistence.characterdatawrapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marvel.domain.model.CharacterDataWrapper;

@Repository
public interface CharacterDataWrapperRepository extends JpaRepository<CharacterDataWrapper, Long>, CharacterDataWrapperRepositoryCustom {

}
