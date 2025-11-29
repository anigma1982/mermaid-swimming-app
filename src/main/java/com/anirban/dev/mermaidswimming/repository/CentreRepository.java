package com.anirban.dev.mermaidswimming.repository;

import com.anirban.dev.mermaidswimming.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CentreRepository extends JpaRepository<Centre, Integer> {
    List<Centre> findByZip(Integer zip);
}
