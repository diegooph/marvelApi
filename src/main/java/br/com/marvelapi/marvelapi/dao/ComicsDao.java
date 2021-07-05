package br.com.marvelapi.marvelapi.dao;

import br.com.marvelapi.marvelapi.entity.Comics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComicsDao extends JpaRepository<Comics, Integer> {
    List<Comics> findByCustomIdIn(List<String> CustomId);
}