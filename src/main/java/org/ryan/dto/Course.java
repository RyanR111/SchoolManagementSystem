package org.ryan.dto;

/**
 * holds the course information in the schoolManagementSystem
 * @author Ryan Roberge
 */
public class Course {
    private double credit;
    private String id;
    private int nextId;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    /**
     * method course
     */
    public Course() {

    }

    /**
     * method to make the courses into a string
     * @return returns the string
     */
    public String toString() {

    }
}
