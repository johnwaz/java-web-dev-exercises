package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String name;
    private double credits;
    private ArrayList<Student> roster;

    public Course(String name, double credits) {
        this.name = name;
        this.credits = credits;
        this.roster = new ArrayList<>();  // Empty array list
    }

    public void enroll(Student student) {
        this.roster.add(student); // Put the student in the ArrayList
    }
}
