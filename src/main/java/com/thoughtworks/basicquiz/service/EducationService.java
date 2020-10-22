package com.thoughtworks.basicquiz.service;

import com.thoughtworks.basicquiz.model.Education;
import com.thoughtworks.basicquiz.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    //TODO GTB-知识点: - EducationService.java:11 EducationRepository应该使用构造器注入，而非直接new
    private final EducationRepository educationRepository = new EducationRepository();
    public EducationService() {
    }

    public List<Education> findEducationsByUserId(Long userId) {
        return educationRepository.findByUserId(userId);
    }

    public void createNewEducation(Education education) {
        educationRepository.insert(education);
    }
}
