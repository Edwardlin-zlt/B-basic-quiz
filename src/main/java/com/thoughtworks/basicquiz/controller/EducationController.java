package com.thoughtworks.basicquiz.controller;

import com.thoughtworks.basicquiz.model.Education;
import com.thoughtworks.basicquiz.service.EducationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    // TODO: I think to follow Restful Api design, this current using url should be change to
    // TODO: "/educations?userId={:userId}"
    @GetMapping("/users/{userId:[\\d]+}/educations")
    public List<Education> findEducationsByUserId(@PathVariable("userId") Long userId) {
        return educationService.findEducationsByUserId(userId);
    }

    @PostMapping("/users/{userId:[\\d]+}/educations")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void createNewEducation(@RequestBody @Valid Education education) {
        educationService.createNewEducation(education);
    }
}
