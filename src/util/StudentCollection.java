package util;

import modal.Student;

public class StudentCollection {

    private Student[] students = new Student[0];

    public void addStudent(Student student){
        Student[] temp = new Student[students.length+1];
        for (int i = 0; i < students.length; i++) {
            temp[i] = students[i];
        }

        temp[temp.length-1] = student;
        students = temp;
    }

    public boolean removeStudent(String studentId){

        if(findStudent(studentId) != null){
            int index = 0;
            Student[] temp = new Student[students.length-1];
            L : for (int i = 0; i < students.length; i++) {
                    if(students[i].getStudentId().equals(studentId)){
                        continue L;
                    }
                    temp[i] = students[i];
            }
            students = temp;
        }

        return false;

    }

    public Student findStudent(String studentId){
        for (int i = 0; i < students.length; i++) {
            if(students[i].getStudentId().equals(studentId)){
                return students[i];
            }
        }
        return null;
    }

}
