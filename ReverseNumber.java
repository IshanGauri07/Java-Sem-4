//Write a Java program to reverse a number.

import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int reverse = 0;

        while ( num != 0 ){
            int digti = num % 10;
            reverse = reverse * 10 + digti;
            num = num / 10;
        }

        System.out.print("After the the revers the number :" + reverse);
    }
}