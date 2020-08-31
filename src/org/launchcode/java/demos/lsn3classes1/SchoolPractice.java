package org.launchcode.java.demos.lsn3classes1;

import java.util.Scanner;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student john = new Student("John", 85, 1, 4.0);
        System.out.println(john.getName());
        /* Scanner input = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        String name = input.next();
        System.out.println("Enter student's ID: ");
        int studentId = input.nextInt();
        System.out.println("Enter student's number of credits: ");
        int numberOfCredits = input.nextInt();
        System.out.println("Enter student's GPA: ");
        double gpa = input.nextDouble();

        Student student = new Student(name, studentId, numberOfCredits, gpa);
        System.out.println("Name: " + student.getName());
        System.out.println("ID #: " + student.getStudentId());
        System.out.println("Credits: " + student.getNumberOfCredits());
        System.out.println("GPA: " + student.getGpa()); */
    }
}
