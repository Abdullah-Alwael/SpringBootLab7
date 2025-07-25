package com.spring.boot.learningmanagementsystem.Model;

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
    private int prerequisiteLevel;

    // can be empty
    private String currentInstructor;
    private ArrayList<String> commonAnswers;
    private ArrayList<String> attendeesList;
}
