// Write a Java program to count vowels in a string.

import java.util.Scanner;

public class CountVowels{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or sentance : ");
        String word = sc.next();

        int count = 0;

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if ( ch == 'a' || ch == 'e' || ch == 'i'  ||  ch == 'o'  || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I'  ||  ch == 'O'  || ch == 'U' ){
                count ++;
            }
        }
        System.out.println("Number of vowels = " + count);
    }
}