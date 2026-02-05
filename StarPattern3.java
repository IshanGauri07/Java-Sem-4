//Write a Java program to print a left half pyramid star pattern.

public class StarPattern3{
    public static void main(String[] args) {
        
        int rows = 5;
        int num = 1;

        for(int i = 0; i <= rows; i++){
           for(int j = 1; j <= i; j++){
            System.out.print(num + " ");
            num++;
           } 
           System.out.println();
        }
    }
}