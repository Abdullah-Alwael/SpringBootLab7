package com.spring.boot.learningmanagementsystem.Service;

import com.spring.boot.learningmanagementsystem.Model.Subject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SubjectService {
    ArrayList<Subject> subjects = new ArrayList<>();

    public void addSubject(Subject s) {
        subjects.add(s);
    }

    public ArrayList<?> getSubjects() {
        return subjects;
    }

    public boolean updateSubject(String iD, Subject subject) {
        for (Subject s : subjects) {
            if (s.getID().equals(iD)) {
                subjects.set(subjects.indexOf(s), subject);
                return true;
            }
        }

        return false;
    }

    public boolean deleteSubject(String iD) {
        for (Subject s : subjects) {
            if (s.getID().equals(iD)) {
                subjects.remove(s);
                return true;
            }
        }

        return false;
    }

    public void addAnswer(String answer) {
        // TODO
    }

    public void addAttendee(String name) {
        // TODO
    }

    public boolean upgradeLevel(String iD, int level) {
        // TODO check for level input validation in the controller

        for (Subject s : subjects) {
            if (s.getID().equals(iD)) {
                s.setPrerequisiteLevel(level);
                return true; // set successfully
            }
        }

        return false; // subject not found
    }

    public void clearAttendees(String iD) {
        for (Subject s : subjects) {
            if (s.getID().equals(iD)) {
                s.getAttendeesList().clear();
            }
        }
    }
}
