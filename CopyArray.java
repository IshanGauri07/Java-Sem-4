// Write a Java program to copy one array to another.

import java.util.Scanner;

public class CopyArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size :");
        int n = sc.nextInt();

        int[] arr1 = new  int[n];
        int[] arr2 = new int[n];

        System.out.print("enter element of array : ");
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt(); 
        }

        for(int i = 0; i < n; i++){
            arr2[i] = arr1[i];
        }

        System.out.print("copied array element : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}