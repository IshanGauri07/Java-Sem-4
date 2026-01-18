
import java.util.Scanner;

//Write a Java program to check whether a number is prime.

public class PrimeNumber{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr a number : ");
        int num = sc.nextInt();

        boolean isPrime = true;
        
        if ( num <= 1 ){
            isPrime = false;
        } else{
            for ( int i = 2; i <= num / 2; i++){
                if( num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.print("It is a prime number. ");
        } else {
            System.out.print("It is not a prime number.");
        }
    }
}