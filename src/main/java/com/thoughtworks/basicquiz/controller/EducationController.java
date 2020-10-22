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
    //TODO GTB-知识点: * 资源按层次组织获取，user是education的父级，如果没有user的概念，单独的education是没有意义的
    // TODO: I think to follow Restful Api design, this current using url should be change to
    // TODO: "/educations?userId={:userId}"
    //TODO GTB-完成度: - EducationController.java:28 Bug，如果用户不存在，不应该返回空List，而应该抛异常404
    @GetMapping("/users/{userId:[\\d]+}/educations")
    public List<Education> findEducationsByUserId(@PathVariable("userId") Long userId) {
        return educationService.findEducationsByUserId(userId);
    }

    //TODO GTB-完成度: - EducationController.java:27 Bug，给不存在的用户添加 education 也能成功
    @PostMapping("/users/{userId:[\\d]+}/educations")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void createNewEducation(@RequestBody @Valid Education education) {
        educationService.createNewEducation(education);
    }
}
