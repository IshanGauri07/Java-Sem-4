
import java.util.Scanner;

//Write a Java program to find the largest element in an array.

public class LargestElement{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int  n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter a array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Largest Element = " + max);
    }
}