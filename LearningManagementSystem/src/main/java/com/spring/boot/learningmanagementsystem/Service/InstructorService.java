package com.spring.boot.learningmanagementsystem.Service;

import com.spring.boot.learningmanagementsystem.Model.Instructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InstructorService {
    
    ArrayList<Instructor> instructors = new ArrayList<>();
    
    public void addInstructor(Instructor i) {
        instructors.add(i);
    }

    public ArrayList<?> getInstructors() {
        return instructors;
    }

    public boolean updateInstructor(String iD, Instructor instructor) {
        for (Instructor i : instructors) {
            if (i.getID().equals(iD)) {
                instructors.set(instructors.indexOf(i), instructor);
                return true;
            }
        }

        return false;
    }

    public boolean deleteInstructor(String iD) {
        for (Instructor s : instructors) {
            if (s.getID().equals(iD)) {
                instructors.remove(s);
                return true;
            }
        }

        return false;
    }

    //TODO add the 4 methods
}
