package org.ryan.dto;

/**
 * methods that manages the entire school system
 * @author Ryan Roberge
 */
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENT_NUM = 5;
    private static final int MAX_STUDENT_NUM = 200;
    private static final int MAX_TEACHER_NUM = 20;
    private static final int MAX_COURSE_NUM = 30;
    private Department[] departments;
    private Course[] courses;
    private Student[] students;
    private Teacher[] teachers;
    int numOfDepts = 0;
    int numOfCourses = 0;
    int numOfTeachers = 0;
    int numOfStudents = 0;

    /**
     * method schoolManagementSystem
     */
    public SchoolManagementSystem(String schoolSystem) {
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        this.courses = new Course[MAX_COURSE_NUM];
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        this.students = new Student[MAX_STUDENT_NUM];
    }

    /**
     * method to find the department
     * @return returns department
     */
    public Department findDepartment(String department) {
        return findDepartment("hi");
    }

    /**
     * method that prints teachers
     */
    public void printTeachers() {

    }

    /**
     * method that modifies the course assigned to a teacher
     */
    public void modifyCourseTeacher() {

    }

    /**
     * method that adds a department
     */
    public void addDepartment(Department department) {
        if (numOfDepts < MAX_DEPARTMENT_NUM) {
            departments[numOfDepts] = department;
            numOfDepts++;
        } else System.out.println("Cannot add new department, max departments reached.");
    }

    /**
     * method to display the departments
     */
    public void displayDepartments() {
        int d = numOfDepts - 1;
        while (d >= 0) {
            System.out.print(departments[d]);
            d--;
        }
    }

    /**
     * method that prints students
     */
    public void printStudents() {

    }

    /**
     * method that finds a student
     * @return returns student
     */
    public Student findStudent() {
        return findStudent();
    }

    /**
     * method to add a course
     */
    public void addCourse(Course course) {
        if (numOfCourses < MAX_COURSE_NUM) {
            courses[numOfCourses] = course;
            numOfCourses++;
        } else System.out.println("Cannot add new course, max courses reached.");
    }

    /**
     * method to display the courses
     */
    public void displayCourses() {

    }

    /**
     * method to register the course
     */
    public void registerCourse() {

    }

    /**
     * method to add a teacher
     */
    public void addTeacher(Teacher teacher) {
        if (numOfTeachers < MAX_TEACHER_NUM) {
            teachers[numOfTeachers] = teacher;
            numOfTeachers++;
        } else System.out.println("Cannot add new teacher, max teachers reached.");
    }

    /**
     * method to display the teacher
     */
    public void displayTeachers() {
        int t = numOfTeachers - 1;
        while (t >= 0) {
            System.out.print(teachers[t]);
            t--;
        }
    }

    /**
     * method to find a course
     * @return returns the course
     */
    public Course findCourse() {

    }

    /**
     * method to print the departments
     */
    public void printDepartments() {

    }

    /**
     * method to add a student
     */
    public void addStudent(Student student) {
        if (numOfStudents < MAX_STUDENT_NUM) {
            students[numOfStudents] = student;
            numOfStudents++;
        } else System.out.println("Cannot add new student, max students reached.");
    }

    /**
     * method to display the students
     */
    public void displayStudent() {
        int s = numOfStudents - 1;
        while (s >= 0) {
            System.out.print(students[s]);
            s--;
        }
    }

    /**
     * method to find a teacher
     * @return returns the found teacher
     */
    public Teacher findTeacher() {

    }
}
