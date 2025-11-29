package com.anirban.dev.mermaidswimming.service;

import com.anirban.dev.mermaidswimming.model.Course;
import com.anirban.dev.mermaidswimming.repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) { this.courseRepository = courseRepository;}

    public List<Course> getAllCourses(){return courseRepository.findAll();}

    public Course getCourseById(Integer id) { return courseRepository.findById(id).orElse(null);}
}
