
import java.util.Scanner;

// Write a Java program to find the smallest element in an array.

public class SmallestElement{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for(int i = 0; i < n; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.print("Smallest Number : " + min);

    }
}