/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schooltest;

/**
 *
 * @author UNGAB_CPE121
 */
public class SchoolTest {
    public static void main(String[] args) {
        Classroom classA = new Classroom("Class A");
        Classroom classB = new Classroom("Class B");

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Student student3 = new Student("Charlie", 103);

        classA.addStudent(student1);
        classA.addStudent(student2);
        classA.addStudent(student3);

        // Display students before transfer
        classA.displayStudents();
        classB.displayStudents();

        // Transfer a student
        System.out.println("\nTransferring Bob to Class B...");
        classA.transferStudent(student2, classB);

        // Display students after transfer
        classA.displayStudents();
        classB.displayStudents();
    }
}
