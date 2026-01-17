// Write a Java program to generate Fibonacci series. 

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of term : ");
        int n = sc.nextInt();

        int First = 0, Second = 1;

        System.out.println("Fibonacci series : ");

        for(int i = 0; i <= n; i++){
            System.out.println(First + " ");

            int next = First + Second;
            First = Second;
            Second = next;
        }
    }
}