/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schooltest;

import java.util.ArrayList;

/**
 *
 * @author UNGAB_CPE121
 */
class Classroom {
    private String className;
    private ArrayList<Student> students;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void transferStudent(Student student, Classroom newClassroom) {
        if (students.contains(student)) {
            removeStudent(student);
            newClassroom.addStudent(student);
            System.out.println(" has been transferred from " + student.name + className + " to " + newClassroom.className);
        } else {
            System.out.println("Student not found in " + className);
        }
    }

    public void displayStudents() {
        System.out.println("Classroom: " + className);
        for (Student student : students) {
            student.displayInfo();
        }
    }
}