package com.thoughtworks.basicquiz.controller;

import com.thoughtworks.basicquiz.model.Education;
import com.thoughtworks.basicquiz.service.EducationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/users/{userId:[\\d]+}/educations")
    public List<Education> findEducationsByUserId(@PathVariable("userId") Long userId) {
        return educationService.findEducationsByUserId(userId);
    }
}
