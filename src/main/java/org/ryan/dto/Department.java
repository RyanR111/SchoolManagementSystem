package org.ryan.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * holds the departments of the SchoolManagementSystem
 * @author Ryan Roberge
 */
@Getter
@Setter
public class Department {
    private String id;
    private static int nextId = 1;
    private String departmentName;

    /**
     * department object
     * @param departmentName the name of the department
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
        return String.format("Department(id=%s,deptName='%s')\n", id, departmentName);
    }
}
