package com.anirban.dev.mermaidswimming.controller;

import com.anirban.dev.mermaidswimming.model.Centre;
import com.anirban.dev.mermaidswimming.service.CentreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Controller
public class CentreController {
    private final CentreService centreService;

    public CentreController(CentreService centreService) {
        this.centreService = centreService;
    }

    @GetMapping
    public List<Centre> getAllCentres(){
        return centreService.getAllCourses();
    }

//    @GetMapping("/{id}")
//    public Centre getCentre(@PathVariable Integer id) {return centreService.getCourseById(id);}
}
