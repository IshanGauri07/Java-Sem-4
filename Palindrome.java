
import java.util.Scanner;

//Write a Java program to check whether a number is palindrome.

public class Palindrome{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while ( num != 0 ){
            int digti = num % 10;
            reverse = reverse * 10 + digti;
            num = num / 10; 
        }

        if( original == reverse){
            System.out.print("Enter number is a palindrome. ");
        } else {
            System.out.println("The number is NOT palindrome. ");
        }
    }
}