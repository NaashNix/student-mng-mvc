package view;

import util.StudentCollection;

import java.util.Scanner;

public class HomeScreen {
    private int option = -1;

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public void view(){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("|                   WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                   |");
        System.out.println("-------------------------------------------------------------------------------");
        //End of the header & Below code lines are for printing options.
        System.out.println("[1] Add New Student                      [2] Add New Students With Marks");
        System.out.println("[3] Add Marks                            [4] Update Student Details");
        System.out.println("[5] Update Marks                         [6] Delete Students");
        System.out.println("[7] Print Student Details                [8] Printing Students Ranks");
        System.out.println("[9] Best In Programming Fundamentals     [10] Best In Database Management System");
        Scanner scn1 = new Scanner(System.in); //Scanner
        System.out.print("Enter an option to continue : ");
        option = scn1.nextInt();
    }

}
