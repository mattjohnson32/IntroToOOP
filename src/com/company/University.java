package com.company;

import java.util.ArrayList;
import java.util.Optional;

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

public Optional findStudent(int studentId){
    for (var Student: studentList){
    }

public void hireProfessor(Professor newFaculty){

    }

public void admitStudent(Student newStudent){

    }

public void runUniversity(){

    }

public void graduateStudents(){

    }



}
