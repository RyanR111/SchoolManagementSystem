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
        Student student1 = new Student("Ryan", "Roberge", science);
        vanier.addStudent(student1);
        vanier.displayStudent();
        Teacher teacher1 = new Teacher("John", "Jo", science);
        vanier.addTeacher(teacher1);
        vanier.displayTeachers();
        Course course1 = new Course("Biology", 2, science);
        vanier.addCourse(course1);
        course1.modifyCourseTeacher(teacher1);
        vanier.displayCourses();
        System.out.println(vanier.findCourse("C002"));
    }
}
