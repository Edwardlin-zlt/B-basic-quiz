package com.thoughtworks.basicquiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    private Long userId;
//    TODO: Why do we use long for year?
    private Long year;
    private String title;
    private String description;
}
