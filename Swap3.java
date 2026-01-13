//Write a Java program to swap three numbers without using a temporary variable.

import java.util.Scanner;

public class Swap3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int a = sc.nextInt();
        
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();

        System.out.println("Enter Third Number :");
        int c = sc.nextInt();

        a = a + b + c;
        b = a - (b + c);
        c = a - (b + c);
        a = a - (b + c);

        System.out.println("After Swapping : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}