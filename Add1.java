// in this question number A and B is given by user.
import java.util.Scanner;

public class Add1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int a = sc.nextInt();

        System.out.println("enter a second number");
        int b = sc.nextInt();
        int c = a + b;

        System.out.println("Sum of a and b = " + c);
    }
}
