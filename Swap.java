// Write a Java program to swap two numbers using a temporary variable.

import java.util.*;

public class Swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("First Number : " + a);
        System.out.println("Second Number : " + b);  
    }
}