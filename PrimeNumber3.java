// Write a Java program to print prime numbers between 1 to 300.

public class PrimeNumber3{
    public static void main(String[] args) {
        
        for( int num = 1; num <= 300; num++){

            boolean isPrime = true;

            if(num <= 1){
                isPrime = false; 
            } else {
                for (int i = 2; i <= num / 2; i++){
                    if( num % 2 == 0 ){
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}