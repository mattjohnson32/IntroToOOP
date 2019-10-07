package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Optional;

public class University {
    private ArrayList<Student> studentList;
    private ArrayList<Professor> faculty;


    public University() {
        studentList = new ArrayList<Student>();
        faculty = new ArrayList<Professor>();
    }

    private void printMenu() {
        System.out.println("Please select what to do next:");
        System.out.println("  [1] Admit Student");
        System.out.println("  [2] Hire Professor");
        System.out.println("  [3] Process Graduation");
        System.out.println("  [4] Look up Student");
        System.out.println("  [5] Exit the program");
        System.out.print("Type the number of your selection:");
    }

    public Optional<Student> findStudent(int studentId) {
        for (var Student : studentList) {
            if(Student.getStudentID() == studentId){
                System.out.println(Student.toString());
                return Optional.of(Student);
            }
        }
        return Optional.empty();
    }
    private void admitStudent (Scanner reader){
            System.out.println("Enter new Student's name:");
            var studentName = reader.nextLine();
            Random rand = new Random();
            studentList.add( new Student(faculty.get(rand.nextInt(faculty.size())) ,studentName));
        }

        private void hireProfessor (Scanner reader){
            System.out.println("Enter a Professor's name: ");
            var professorName = reader.nextLine();
            System.out.println("Enter the Department:");
            var department = reader.nextLine();
            faculty.add(new Professor(professorName, department));


        }

        public void runUniversity () {
            var inputGetter = new Scanner(System.in);
            while (true) {
                printMenu();
                var userResponse = inputGetter.nextInt();
                inputGetter.nextLine();
                switch (userResponse) {
                    case 1:
                        if(faculty.size()>=1){
                        admitStudent(inputGetter);
                        break;
                        }
                        else{
                            System.out.println("Need to hire professors first.");
                        }
                    case 2:
                        hireProfessor(inputGetter);
                        break;
                    case 3:
                        graduateStudents();
                        break;
                    case 4:
                        System.out.println("Enter a StudentID:");
                        Scanner reader = new Scanner(System.in);
                        int number = reader.nextInt();
                        var foundStudent = findStudent(number);
                        if(foundStudent.isPresent()) {
                            System.out.println("Do you want to enter Student Menu? 1. Yes 2. No");
                            int answer = reader.nextInt();
                            if(answer == 1){
                                System.out.println("  [1] Take Class");
                                System.out.println("  [2] Select Advisor");
                                int answer1 = reader.nextInt();
                                if(answer1 == 1){
                                    System.out.println("What was your grade in the class?");
                                    float grade = reader.nextFloat();
                                    System.out.println("How many credits was the class?");
                                    int credits = reader.nextInt();
                                    foundStudent.get().takeClass(credits, grade);
                                    break;
                                }
                                else if(answer1 == 2){
                                    System.out.println("Which professor would you like?");
                                    for (int i = 0; i<faculty.size();i++){
                                        System.out.println((i+1)+"."+ faculty.get(i).getName());
                                    }
                                    int professor = reader.nextInt();
                                    foundStudent.get().getAdvisor().removeAdvisee(foundStudent.get());
                                    foundStudent.get().changeAdvisor(faculty.get(professor-1));
                                    foundStudent.get().getAdvisor().addAdvisee(foundStudent.get());
                                    break;
                                }
                            }
                            else if(answer == 2){
                                System.out.println("Okay, have a great day!");
                                break;
                            }


                        }
                        else
                            System.out.println("Student not found.");
                            break;
                    case 5:
                        System.exit(0);

                    }



                }
            }

        public void graduateStudents () {
        for (int i = 0; i<studentList.size();i++){
            if(studentList.get(i).getGpa()>=2.0 && studentList.get(i).getcreditHours()>=20) {
                if (studentList.get(i).getGpa() > 3.7) {
                    System.out.println("Congrats " + studentList.get(i).getName() + " you graduated with high honors!");
                    studentList.remove(i);
                }
                else if (studentList.get(i).getGpa() <= 3.7 && studentList.get(i).getGpa() >= 3.3) {
                    System.out.println("Congrats " + studentList.get(i).getName() + " you graduated with honors!");
                    studentList.remove(i);
                } else {
                    System.out.println(("Congrats " + studentList.get(i).getName() + " you have graduated!"));
                    studentList.remove(i);
                }
            }

        }

        }


}