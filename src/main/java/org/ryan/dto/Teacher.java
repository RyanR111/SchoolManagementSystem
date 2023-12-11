package org.ryan.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * holds the teacher information in the schoolManagementSystem
 * @author Ryan Roberge
 */
@Getter
@Setter
public class Teacher {
    private String fname;
    private String lname;
    private Department department;
    private String id;
    private int nextId = 1;

    /**
     * teacher object
     * @param fname first name of the teacher
     * @param lname last name of the teacher
     * @param department the teacher's department
     */
    public Teacher(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("T%03d", nextId++);
    }

    /**
     * method to turn teachers to a string
     * @return returns the string
     */
    public String toString() {
        return String.format("{Teacher{id=%s,fname='%s',lname='%s',dept='%s'}\n", id, fname, lname, department);
    }
}
