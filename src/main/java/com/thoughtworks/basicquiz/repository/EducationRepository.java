package com.thoughtworks.basicquiz.repository;

import com.thoughtworks.basicquiz.model.Education;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EducationRepository {
    private static final List<Education> educations = new ArrayList<Education>();

    static {
        educations.add(new Education(1L, 2005L, "Secondary school specializing in artistic", "Eos, explicabo, nam, tenetur et ab eius deserunt aspernatur ipsum ducimus quibusdam quis voluptatibus."));
        educations.add(new Education(1L, 2009L, "First level graduation in Graphic Design", "Aspernatur, mollitia, quos maxime eius suscipit sed beatae ducimus quaerat quibusdam perferendis? Iusto, quibusdam asperiores unde repellat."));
    }

    public List<Education> findByUserId(Long userId) {
        return educations.stream()
                .filter(education -> Objects.equals(education.getUserId(), userId))
                .collect(Collectors.toList());
    }
}
