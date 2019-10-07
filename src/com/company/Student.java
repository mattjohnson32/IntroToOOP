package com.company;

public class Student {
    private int studentID;
    private static int nextID = 2000;
    private float gpa;
    private String name;
    private Professor advisor;
    private int numberOfCredits;
    public Student(Professor InitialAdvisor, String studentName){
        name = studentName;
        advisor = InitialAdvisor;
        gpa = 0;
        numberOfCredits = 0;
        studentID = nextID;
        nextID++;


    }
public void takeClass(int credits, float grade){

}
public void changeAdvisor(Professor newAdvisor){
        advisor = newAdvisor;
}
public float getGpa(){
        return gpa;
}
public int getcreditHours(){
      return numberOfCredits;
}
public int getStudentID(){
        return studentID;
}
public Professor getAdvisor(){
        return advisor;
}
public String toString(){
        return new String("Name: "+ name + "\nStudent ID: " + studentID + "\nAdvisor's Name: " + advisor + "\nGPA: " + gpa);
}
}

