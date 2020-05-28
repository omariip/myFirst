package studentlist;

import java.util.Scanner;

/**
 * This class creates students
 *
 * @author Paul Bonenfant
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // create an array that can hold 2 students
        Student[] students = new Student[2];
        
        for (int i = 0; i < students.length; i++) {
            
            System.out.println("Enter the student name");
            String name = input.nextLine();
            Student student = new Student(name);
            
            students[i] = student;
            
        }
    
        System.out.println("Printing out the students");
        
        for (Student student: students) {
            System.out.println(student.getName());
        } 

    }

}

