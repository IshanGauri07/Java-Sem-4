
import java.util.Scanner;

// Write a Java program to search an element in an array.

public class SearchElement{
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Size of Array : ");
      int n = sc.nextInt();

      int[] arr = new int[n];

      System.out.print("Enter the element : ");
      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }

      System.out.print("Enter the Element Searsch : ");
      int key = sc.nextInt();

      boolean found = false;

      for(int i = 0; i < n; i++){
        if(arr[i] == key){
            System.out.print("Element found index : " + i);
            found = true;
            break;
        }
      }

      if(!found) {
        System.out.print("Element is not found : ");
      }
    } 
}