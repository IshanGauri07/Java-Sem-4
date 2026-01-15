
import java.util.Scanner;

// Write a Java program to find the largest of three numbers.

public class Largestnumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Numbeer : ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        if ( a > b && a > c){
            System.out.println(a + " is a largest number");
        } 
        else if ( b > a && b > c){
            System.out.println(b + " is a largest number");
        }
        else{
            System.out.println(c + " is largest number");
        }
    }
}