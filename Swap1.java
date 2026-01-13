// Write a Java program to swap two numbers without using a temporary variable.

import java.util.Scanner;

public class Swap1{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("First Number :" + a);
        System.out.println("Second Number :" + b);
    }
}