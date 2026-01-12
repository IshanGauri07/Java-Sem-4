/* Write a Java program to store and display student information.
The program should:
1. Declare variables to store:
Student name (String)
Student ID (int)
Student age (int)
Student fee (float)
Student grade (char)

2. Initialize the variables with appropriate values.
3. Display all the student details using System.out.println(). */

public class Main {
    public static void main(String[] args) {
        
        String StudentName = "Ishan Gauri";
        int StudentID = 07;
        int StudentAge = 20;
        float StudentFee = 3.5f;
        char Studentgrade = 'A';

        System.out.println("Student Name : " + StudentName);
        System.out.println("Student id : " + StudentID );
        System.out.println("Student Age : " + StudentAge);
        System.err.println("Student Fee : " + StudentFee);
        System.err.println("Student Grade : " + Studentgrade);

    }
}