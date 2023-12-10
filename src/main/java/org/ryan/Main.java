package org.ryan;

import org.ryan.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem vanier = new SchoolManagementSystem("Vanier");
        Department science = new Department("Science");
        Department animals = new Department("AnimalHealthTech");
        vanier.addDepartment(animals);
        vanier.addDepartment(science);
        vanier.displayDepartments();
        Student student = new Student("Ryan", "Roberge", science);
        Teacher teacher1 = new Teacher("Hello", "World", science);
        vanier.addTeacher(teacher1);
        vanier.displayTeachers();
        Course course = new Course("Biology", 2, science);
    }
}
