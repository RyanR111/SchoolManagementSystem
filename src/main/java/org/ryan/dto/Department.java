package org.ryan.dto;

/**
 * holds the departments of the schoolManagementSystem
 * @author Ryan Roberge
 */
public class Department {
    private String id;
    private int nextId;
    private String departmentName;

    /**
     * method Department
     */
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.id = String.format("D%03d", nextId++);
    }

    /**
     * method to turn the departments to a string
     * @return returns a string
     */
    public String toString() {

    }
}
