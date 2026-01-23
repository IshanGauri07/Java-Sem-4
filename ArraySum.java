
import java.util.Scanner;

// Write a Java program to find the sum of array elements.

public class ArraySum{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Emter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter a array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }

        System.out.print("Sum of array : " + sum );
    }
}