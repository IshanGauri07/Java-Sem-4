// Write a Java program to find the reverse of a string.

import java.util.Scanner;

public class StringReverse{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String or Sentence : ");
        String word = sc.next();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        System.out.println("After Reverse The String : " + reverse);


    }
}