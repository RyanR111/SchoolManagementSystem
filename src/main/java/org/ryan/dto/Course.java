package org.ryan.dto;

import java.util.Arrays;

/**
 * holds the course information in the schoolManagementSystem
 * @author Ryan Roberge
 */
public class Course {
    private double credits;
    private String id;
    private int nextId = 1;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    /**
     * method course
     */
    public Course(String courseName, double credits, Department department) {
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
        this.id = String.format("C%03d", nextId++);
    }

    /**
     * method to make the courses into a string
     * @return returns the string
     */
    public String toString() {
        return String.format("Course{id=%s,courseName='%s',dept=%s, credits=%.1f, teacher=%s,students=%s}\n", id,
                courseName, department, credits, teacher, Arrays.toString(students));
    }
}
