// Java program to demonstrate Method Overloading.

import java.util.Scanner;

public class MethodOverloading{

    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }

    static double  add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Adding 2 interger : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum = " + add(a, b));

        System.out.print("Adding 3 integer :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("sum = " + add(x, y, z)); 
 
        System.out.println("Adding 2 double : ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("sum = " + add(d1, d2));
    }
}