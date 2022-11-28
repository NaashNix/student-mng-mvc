package view;

import controller.AddStudentController;

import java.util.Scanner;

public class AddStudent {
    String studentID;
    String studentName;

    Scanner scanner = new Scanner(System.in);
    AddStudentController addStudentController = new AddStudentController();

    public void view(){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("|                            ADD NEW STUDENT WITH MARKS                       |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Enter Student ID : ");
        studentID = scanner.nextLine();
        boolean isExists = addStudentController.checkIsExists(studentID);

        if(isExists){
            System.out.println("The student ID already exits.!");

        }

        System.out.print("Enter Student Name : ");
        studentName = scanner.nextLine();

    }
}
