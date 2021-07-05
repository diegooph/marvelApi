package br.com.marvelapi.marvelapi.dao;

import br.com.marvelapi.marvelapi.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsDao extends JpaRepository<Events, Integer> {
    List<Events> findByCustomIdIn(List<String> CustomId);
}