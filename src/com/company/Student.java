package com.company;

public class Student {
    private int studentID;
    private static int nextID = 2000;
    private float gpa;
    private String name;
    private Professor advisor;
    private int numberOfCredits;
    public Student(Professor InitialAdvisor, String studentName) {
        name = studentName;
        advisor = InitialAdvisor;
        gpa = 0;
        numberOfCredits = 0;
        studentID = nextID;
        nextID++;

    }


    public void takeClass(int credits, float grade){
        float totalPoints = gpa * numberOfCredits;
        if(grade>=90) {
            totalPoints += 4.0 * credits;
        }
        if(grade<=89 && grade>=80) {
            totalPoints += 3.0 * credits;
        }
        if(grade<=79 && grade>=70) {
            totalPoints += 2.0 * credits;
        }
        if(grade<=69 && grade>=60) {
            totalPoints += 1.0 * credits;
        }
        if(grade<=59){
            totalPoints+=0.0*credits;
        }
        numberOfCredits+=credits;
        gpa=totalPoints/numberOfCredits;


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
public String getName(){
        return name;
}

}

