/*Q2. Write a java program to reverse a String*/

package Assignments.corejava.Ass5;

import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println(s.reverse());
    }
    
}
