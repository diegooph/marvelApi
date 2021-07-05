package br.com.marvelapi.marvelapi.dao;

import br.com.marvelapi.marvelapi.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDao extends JpaRepository<Character, Integer> {
     Character findByCustomId(String CustomId);
}