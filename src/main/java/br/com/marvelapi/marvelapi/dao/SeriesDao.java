package br.com.marvelapi.marvelapi.dao;

import br.com.marvelapi.marvelapi.entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeriesDao extends JpaRepository<Series, Integer> {
    List<Series> findByCustomIdIn(List<String> CustomId);
}