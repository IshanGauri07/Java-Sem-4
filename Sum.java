
import java.util.Scanner;

//Write a Java program to find the sum of digits of a number.

public class Sum{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int sum = 0;

        while( num > 0 ) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10; 
        }

        System.out.print("Sum of digits = " + sum);
    }
}
