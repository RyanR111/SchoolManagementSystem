package org.ryan.dto;

/**
 * holds the students of the schoolManagementSystem
 * @author Ryan Roberge
 */
public class Student {
    private String fname;
    private String lname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private int nextId = 0;
    private Department department;

    /**
     * method Student
     */
    public Student(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("S%03d", nextId++);
    }

    /**
     * method to turn the students to a string
     * @return returns the string
     */
    public String toString() {

    }
}
