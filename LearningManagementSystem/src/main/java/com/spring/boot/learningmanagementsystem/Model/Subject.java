package com.spring.boot.learningmanagementsystem.Model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Subject {

    @NotEmpty(message = "ID can not be empty")
    private String iD;

    @NotEmpty(message = "topic can not be empty")
    private String topic;

    @NotNull(message = "prerequisiteLevel can not be empty")
    @Min(value = 1, message = "prerequisiteLevel can not be less than 1, each year has 2 levels")
    @Max(value = 10, message = "prerequisiteLevel can not be more than 10, each year has 2 levels")
    private int prerequisiteLevel;

    // can be empty
    private String currentInstructor;
    private ArrayList<String> commonAnswers;
    private ArrayList<String> attendeesList;
}
