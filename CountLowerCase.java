/*ower Case Count
Lewis is given a string S of length N. He likes lowercase letters more than the upper case letters and wants to find their count. 
Your task is to help him find and return a string representing the lowercase letters and the total count.
Input Format
Input1: A string
Input2: An integer representing the length of string
Output Format                                                                                                                                       
Return a string representing the lowercase letters and the total count.
Sample Input 1
input1: This is A Test STRING with LOwer Case
input2: 37
Sample Output
hisisestwithwerase 18 */

import java.util.Scanner;

public class CountLowerCase{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(Character.isLowerCase(x)){
                System.out.print(x);
                count++;
            }
        }
        System.out.println( " " + count);
    }
}