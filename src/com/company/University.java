package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class University {
    private ArrayList<Student> studentList;
    private ArrayList<Professor> faculty;
}

public University(){
    studentList = new ArrayList<Student>();
    faculty = new ArrayList<Professor>();
}

private void printMenu(){
    System.out.println("Please select what to do next:");
    System.out.println("  [1] Admit Student");
    System.out.println("  [2] Hire Professor");
    System.out.println("  [3] Process Graduation");
    System.out.println("  [4] Look up Student");
    System.out.println("  [5] Exit the program");
    System.out.print("Type the number of your selection:");
}

public Student findStudent(int studentId){
    for (var Student: studentList){
    }

    private Student admitStudent(Scanner reader){
        System.out.println("Enter new Student's name:");
        var studentName = reader.nextLine();
        var newStudent = new Student(studentName);
        studentList.add(newStudent);
        return newStudent;
    }

    private Professor hireProfessor(Scanner reader){
        System.out.println("Enter a Professor's name: ");
        var professorName = reader.nextLine();
        var newFaculty = new Professor(professorName);
        faculty.add(newFaculty);
        return newFaculty;


    }

public void runUniversity(){
        var inputGetter = new Scanner(System.in);
        while(true){
            printMenu();
            var userResponse = inputGetter.nextInt();
            inputGetter.nextLine();
            switch (userResponse){
                case 1:
                    var newStudent = admitStudent(inputGetter);
                    break;
                case 2:
                    var newFaculty = hireProfessor(inputGetter);
                    break;
                case 3:


            }
        }
    }

public void graduateStudents(){

    }



}

    private void hireProfessor(Scanner inputGetter) {
    }

    private void admitStudent(Scanner inputGetter) {
    }
