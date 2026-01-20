//Write a Java program to check whether a string is palindrome.

import java.util.Scanner;

public class StringPalindrome{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String or Sentance : ");
        String word = sc.next();

        String originalString = word;
        String reverseString = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseString = reverseString + word.charAt(i);
        }

        if ( originalString.equals(reverseString) ){
            System.out.print("This String is palindrome ");
        } else {
            System.out.print("This String is not palindrome ");
        }
    }
}