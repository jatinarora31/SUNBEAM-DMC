/*Q3. Write a java code to check string is palindrome.*/

package Assignments.corejava.Ass5;

import java.util.Scanner;
class Palindrome {

    public static boolean palindrome(StringBuilder s) {
        String s1 = s.toString();
        return s.reverse().toString().equals(s1);
    }
}

public class Ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(Palindrome.palindrome(sb));
    }
}