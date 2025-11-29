package com.anirban.dev.mermaidswimming.repository;

import com.anirban.dev.mermaidswimming.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
