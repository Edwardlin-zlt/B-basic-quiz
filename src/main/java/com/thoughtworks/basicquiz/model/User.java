package com.thoughtworks.basicquiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    @NotNull
    @Size(min = 1, max = 128)
    private String name;
    @NotNull
    @Min(17)
    private Long age;
    @NotNull
    // TODO: change this number to bytes
    @Size(min = 8, max = 512)
    private String avatar;
    @Size(max = 1024)
    private String description;
}
