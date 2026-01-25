// Write a Java program to count even and odd numbers in an array.

import java.util.Scanner;

public class CountArray{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter element in array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); 
        }

        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0) {
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even number count : " + evenCount);
        System.out.println("Odd number count : " + oddCount);

    }
}