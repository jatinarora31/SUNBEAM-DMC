package Assignments.corejava.Ass1;

import java.util.Scanner;

public class Ques2 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Double a,b,avg;
        System.out.println("Enter 1st Number - ");
        if(sc.hasNextDouble()) {
            a = sc.nextDouble();
        } else {
            System.out.println(" ERROR!! Number entered is not Double.");
            return;
        }

        System.out.println("Enter 2nd Number - ");
        if(sc.hasNextDouble()) {
            b = sc.nextDouble();
        } else {
            System.out.println("ERROR!! Number entered is not Double.");
            return;
        }
        System.out.println((a+b)/2);

    }

}
