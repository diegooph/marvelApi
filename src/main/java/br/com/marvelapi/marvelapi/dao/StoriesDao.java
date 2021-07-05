package br.com.marvelapi.marvelapi.dao;

import br.com.marvelapi.marvelapi.entity.Stories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoriesDao extends JpaRepository<Stories, Integer> {
    List<Stories> findByCustomIdIn(List<String> CustomIds);

}