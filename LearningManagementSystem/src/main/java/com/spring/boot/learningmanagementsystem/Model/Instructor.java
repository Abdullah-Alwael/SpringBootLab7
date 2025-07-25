package com.spring.boot.learningmanagementsystem.Model;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Instructor {

    @NotEmpty(message = "ID can not be empty")
    private String iD;

    @NotEmpty(message = "name can not be empty")
    @Pattern(regexp = "[a-zA-Z ]", message = "name must not have numbers or any special characters")
    private String name;

    // can be empty
    private String currentClass;
    private String currentStudentQuestion;

    @AssertFalse(message = "The teacher can not start teaching before attending a class")
    private boolean isTeaching;

    @AssertFalse(message = "The teacher can not start marking attendance before attending a class")
    private boolean hasMarkedAttendance;
}
