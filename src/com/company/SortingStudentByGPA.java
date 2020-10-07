package com.company;

public class SortingStudentByGPA  {
    String name;
    int ID;
    int GPA;
    public SortingStudentByGPA(String name, int id, int gpa){
        this.name=name;
        this.ID=id;
        this.GPA=gpa;
    }
    public int getGPA(){
        return this.GPA;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", GPA=" + GPA +
                '}';
    }
}
