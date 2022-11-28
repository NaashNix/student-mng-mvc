package controller;

import util.StudentCollection;
import view.AddStudent;

import java.util.Scanner;

public class AddStudentController {

    StudentCollection students;

    AddStudent addStudent = new AddStudent();

    public void start(StudentCollection studentCollection){
        this.students = studentCollection;
        addStudent.view();
    }

    public boolean checkIsExists(String studentId){
        return students.isExists(studentId);
    }

}
