package com.anirban.dev.mermaidswimming.service;

import com.anirban.dev.mermaidswimming.model.Centre;
import com.anirban.dev.mermaidswimming.repository.CentreRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CentreService {
    private final CentreRepository centreRepository;

    public CentreService(CentreRepository centreRepository) {
        this.centreRepository = centreRepository;
    }

    public List<Centre> getAllCourses(){return centreRepository.findAll();}

    public Centre getCourseById(Integer id) { return centreRepository.findById(id).orElse(null);}
}
