package org.ryan.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * holds the students of the schoolManagementSystem
 * @author Ryan Roberge
 */
@Getter
@Setter
public class Student {
    private String fname;
    private String lname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private int nextId = 1;
    private Department department;

    /**
     * student object
     * @param fname student's first name
     * @param lname student's last name
     * @param department student's department
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
        return String.format("{Student{id=%s,fname='%s',lname='%s',dept=%s, courseNum=%d,courses=%s}\n", id, fname,
                lname, department, courseNum, Arrays.toString(courses));

    }
}
