package com.spring.boot.learningmanagementsystem.Service;

import com.spring.boot.learningmanagementsystem.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s){
        students.add(s);
    }

    public ArrayList<?> getStudents(){
        return students;
    }

    public boolean updateStudent(String iD, Student student){
        for (Student s:students){
            if (s.getID().equals(iD)){
                students.set(students.indexOf(s),student);
                return true;
            }
        }

        return false;
    }

    public boolean deleteStudent(String iD){
        for (Student s:students){
            if (s.getID().equals(iD)){
                students.remove(s);
                return true;
            }
        }

        return false;
    }



}
