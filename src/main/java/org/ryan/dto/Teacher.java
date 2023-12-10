package org.ryan.dto;

/**
 * holds the teacher information in the schoolManagementSystem
 * @author Ryan Roberge
 */
public class Teacher {
    private String fname;
    private String lname;
    private Department department;
    private String id;
    private int nextId = 1;

    /**
     * method Teacher
     */
    public Teacher(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("T%03d", nextId++);
    }

    /**
     * method to turn teachers to string
     * @return returns the string
     */
    public String toString() {
        return String.format("{Teacher{id=%s,fname='%s',lname='%s',dept='%s'}\n", id, fname, lname, department);
    }
}
