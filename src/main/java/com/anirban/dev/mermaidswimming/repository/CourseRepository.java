package com.anirban.dev.mermaidswimming.repository;

import com.anirban.dev.mermaidswimming.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
