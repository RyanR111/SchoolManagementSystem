package org.ryan.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * methods that manage the entire school system
 * @author Ryan Roberge
 */
@Getter
@Setter
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
    int s = 0;

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
    public Department findDepartment(String deptId) {
        int deptCounter = numOfDepts - 1;
        while (deptCounter >= 0) {
            if (departments[deptCounter].getId().equals(deptId)) {
                return departments[deptCounter];
            } else if (deptCounter == 0) {
                return null;
            }
            deptCounter--;
        }
        return null;
    }

    /**
     * method that modifies the course assigned to a teacher
     */
    public void modifyCourseTeacher(String courseId, String teacherId) {
        int teacherCounter = numOfTeachers - 1;
        while (teacherCounter >= 0) {
            if (teachers[teacherCounter].getId().equals(teacherId)) {
                break;
            } else if (teacherCounter == 0) {
                System.out.println("Teacher not found!");
            }
            teacherCounter--;
        }
            int courseCounter = numOfCourses - 1;
            while (courseCounter >= 0) {
                if (courses[courseCounter].getId().equals(courseId)) {
                    break;
                } else if (teacherCounter == 0) {
                    System.out.println("Course not found!");
                }
                courseCounter--;
            }
            courses[courseCounter].setTeacher(teachers[teacherCounter]);
        }

    /**
     * method that adds a department
     */
    public void addDepartment(Department department) {
        if (numOfDepts < MAX_DEPARTMENT_NUM) {
            departments[numOfDepts] = department;
            System.out.printf("Department %s added successfully.\n", department);
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
     * method that finds a student
     * @return returns student
     */
    public Student findStudent(String studentId) {
        int studentCounter = numOfStudents - 1;
        while (studentCounter >= 0) {
            if (students[studentCounter].getId().equals(studentId)) {
                return students[studentCounter];
            } else if (studentCounter == 0) {
                return null;
            }
            studentCounter--;
        }
        return null;
    }

    /**
     * method to add a course
     */
    public void addCourse(Course course) {
        if (numOfCourses < MAX_COURSE_NUM) {
            courses[numOfCourses] = course;
            System.out.printf("Course %s added successfully.\n", course);
            numOfCourses++;
        } else System.out.println("Cannot add new course, max courses reached.");
    }

    /**
     * method to display the courses
     */
    public void displayCourses() {
        int c = numOfCourses - 1;
        while (c >= 0) {
            System.out.print(courses[c]);
            c--;
        }
    }

    /**
     * method to register the course
     */
    public void registerCourse(String courseId, String studentId) {
        int studentCounter = numOfStudents - 1;
        while (studentCounter >= 0) {
            if (students[studentCounter].getId().equals(studentId)) {
                break;
            } else if (studentCounter == 0) {
                System.out.println("Student not found!");
            } studentCounter--;
        }

        int courseCounter = numOfCourses - 1;
        while (courseCounter >= 0) {
            if (courses[courseCounter].getId().equals(courseId)) {
                break;
            } else if (courseCounter == 0) {
                System.out.println("Course not found!");
            } courseCounter--;
        }
            courses[courseCounter].setStudents(students);
    }

    /**
     * method to add a teacher
     */
    public void addTeacher(Teacher teacher) {
        if (numOfTeachers < MAX_TEACHER_NUM) {
            teachers[numOfTeachers] = teacher;
            System.out.printf("Teacher %s added successfully.\n", teacher);
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
    public Course findCourse(String courseId) {
        int courseCounter = numOfCourses - 1;
        while (courseCounter >= 0) {
            if (courses[courseCounter].getId().equals(courseId)) {
                return courses[courseCounter];
            } else if (courseCounter == 0) {
                return null;
            }
            courseCounter--;
        }
        return null;
    }

    /**
     * method to add a student
     */
    public void addStudent(Student student) {
        if (numOfStudents < MAX_STUDENT_NUM) {
            students[numOfStudents] = student;
            System.out.printf("Student %s added successfully.\n", student);
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
    public Teacher findTeacher(String teacherId) {
        int teacherCounter = numOfTeachers - 1;
        while (teacherCounter >= 0) {
            if (teachers[teacherCounter].getId().equals(teacherId)) {
                return teachers[teacherCounter];
            } else if (teacherCounter == 0) {
                return null;
            }
            teacherCounter--;
        }
        return null;
    }
}
