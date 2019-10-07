package com.company;

import java.util.ArrayList;

public class Professor {
    private ArrayList<Student> adviseeList;
    private String name;
    private String department;

    public Professor(String profName, String dept){
        name = profName;
        department = dept;
        adviseeList = new ArrayList<Student>();

    }


    public void addAdvisee(Student newAdvisee){
        adviseeList.add(newAdvisee);
}
public void removeAdvisee(Student formerAdvisee){
        for (int i = 0; i<adviseeList.size(); i++){
            if(adviseeList.get(i).equals(formerAdvisee)){
                adviseeList.remove(i);
            }
        }
}
public String getName(){
        return name;
}
public String toString(){
       return new String(name + "\nDepartment: " + department);
}

}
