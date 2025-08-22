/*Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day*/

package Assignments.Ass2;

import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total miles travelled:- ");
        double miles = sc.nextDouble();
        System.out.print("Enter cost per gallon of gasoline:- ");
        double cost = sc.nextDouble();
        System.out.print("Enter parking fees per day:- ");
        double park = sc.nextDouble();
        System.out.print("Enter tolls per day:- ");
        double tolls = sc.nextDouble();

        double totalCost = 0;
        double avgMiles = 0;

        avgMiles = miles*cost;

        totalCost = avgMiles + park + tolls;

        System.out.print("Your total cost per day is:- "+totalCost);

    }

}
