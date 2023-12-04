package org.ryan;

import org.ryan.dto.Course;
import org.ryan.dto.Department;
import org.ryan.dto.Student;
import org.ryan.dto.Teacher;

public class Main {
    public static void main(String[] args) {
        Department department = new Department("Science");
        Student student = new Student("Ryan", "Roberge", department);
        Teacher teacher = new Teacher("Hello", "World", department);
        Course course = new Course("Biology", 2, department);
    }
}
