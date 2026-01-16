//Write a Java program to check whether a number is positive or negative.

import java.util.Scanner;

public class  PossNega {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if( num > 0){
            System.out.println("This is possitive number ");
        }
        else if ( num < 0){
            System.out.println("This is negative number ");
        }
        else {
            System.out.println("Zero");
        }
    }
}