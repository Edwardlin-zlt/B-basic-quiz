package com.thoughtworks.basicquiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    private Long userId;
//    TODO: Why do we use Long type for year?
    @NotNull
    private Long year;
    @NotNull
//  TODO: change this number to bytes
    @Size(min = 1, max = 256)
    private String title;
    @NotNull
    @Size(min = 1, max = 4096)
    private String description;
}
