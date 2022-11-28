package controller;

import util.ClearConsole;
import util.StudentCollection;
import view.HomeScreen;

import java.util.Scanner;

public class HomeScreenController {

    ClearConsole clearConsole = new ClearConsole();
    public void start(StudentCollection students){
        HomeScreen hs = new HomeScreen();
        hs.view();
        int option = hs.getOption();
        do {

            if(option > 0 && option < 12){
                switch (option) { //enhanced switch for selecting and calling methods.
                    case 1 : {
                        clearConsole.clear();
                        addStudent(students); //start to run adding student without adding marks.

                    }
                    case 2 : {
                        clearConsole.clear();
                        addStudentWithMarks(students);

                    }
                    case 3 : {
                        clearConsole.clear();
                        addStudentsMarks(students);

                    }
                    case 4 : {
                        clearConsole.clear();
                        updateStudentDetails(students);
                    }
                    case 5 : {
                        clearConsole.clear();
                        updateMarks(students);
                    }
                    case 6 : {
                        clearConsole.clear();
                        deleteStudent(students);
                    }
                    case 7 : {
                        clearConsole.clear();
                        printStudentDetails(students);
                    }
                    case 8 : {
                        clearConsole.clear();
                        printStudentRanks(students);
                    }
                    case 9 : {
                        clearConsole.clear();
                        bestInPF(students);
                    }
                    case 10 : {
                        clearConsole.clear();
                        bestInDB(students);
                    }
                    case 11 : {
                        System.exit(1);
                    }
                }
            }else{
                System.out.println("Invalid Option");
            }
        } while (true);
    }
}
