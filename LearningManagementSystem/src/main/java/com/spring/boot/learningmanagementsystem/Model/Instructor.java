package com.spring.boot.learningmanagementsystem.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Instructor {
    private String iD;
    private String name;
    private String currentClass;
    private String currentStudentQuestion;
    private boolean isTeaching;
    private boolean hasMarkedAttendance;
}
