package org.ryan.dto;

/**
 * holds the teacher information in the schoolManagementSystem
 * @author Ryan Roberge
 */
public class Teacher {
    private String fName;
    private String lName;
    private Department department;
    private String id;
    private int nextId;

    /**
     * method Teacher
     */
    public Teacher(String fName, String lName, Department department) {
        this.fName = fName;
        this.lName = lName;
        this. department = department;
        this.id = String.format("T%03d", nextId++);
    }

    /**
     * method to turn teachers to string
     * @return returns the string
     */
    public String toString() {

    }
}
