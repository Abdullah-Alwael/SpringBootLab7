package com.spring.boot.learningmanagementsystem.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    @NotEmpty(message = "ID can not be empty")
    private String iD;

    @NotEmpty(message = "name can not be empty")
    @Pattern(regexp = "[a-zA-Z ]", message = "name must not have numbers or any special characters")
    private String name;

    private String currentClass;

    @NotNull(message = "currentLevel can not be empty")
    @Min(value = 1, message = "currentLevel can not be less than 1, each year has 2 levels")
    @Max(value = 10, message = "currentLevel can not be more than 10, each year has 2 levels")
    private int currentLevel;

    @AssertFalse(message = "The student can not start studying before attending a class")
    private boolean isStudying;

    @Min(value = 0, message = "GPA can not be negative")
    @Max(value = 5, message = "GPA can not be more than 5 out of 5")
    private double gPA;
}
