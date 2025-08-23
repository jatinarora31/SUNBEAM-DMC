/*Q1. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-ordinate system.
Create a parameterized constructor to init x & y co-ords. Add a method to return
string form of point's x & y co-ords
Hint : public String getDetails())
Add isEqual method to Point2D class :a boolean returning method : must return true if n only if both
points are having same x,y co-ords or false otherwise.
Add calculateDistance method to calculate distance between current point and specified point &
return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
Write TestPoint class , in package "tester" , with a main method, Accept co-ordinates of 2 points from
user (Scanner) --to create 2 points (p1 & p2)
Use getDetails method to display point details.(p1's details & p2's details)
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)
If they are not located at the same position , display distance between p1 & p2*/

package Assignments.Ass3.com.app.geometry;


import java.util.Scanner;

class Point2D {


    int x1;
    int x2;
    int y1;
    int y2;

    Point2D() {

    }

    Point2D(int x1,int y1,int x2,int y2) {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;

    }

    public String getDetails() {
        return "Your co-ordinates are - {("+x1+","+y1+"),("+x2+","+y2+")}" ;
    }

    public boolean isEqual() {
        if(x1==x2 && y1==y2) return true;
        return false;
    }

    public double calculateDistance() {
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }

}

public class Ques3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter co-ordinate x1 - ");
        int x1 = sc.nextInt();
        System.out.print("Enter co-ordinate y1 - ");
        int y1 = sc.nextInt();
        System.out.print("Enter co-ordinate x2 - ");
        int x2 = sc.nextInt();
        System.out.print("Enter co-ordinate y2 - ");
        int y2 = sc.nextInt();
        Point2D point = new Point2D(x1,y1,x2,y2);

        System.out.println(point.getDetails());
        if(point.isEqual()) System.out.println("Co-ordinates are same");
        else System.out.println("Co-ordinates are different");
        if(!point.isEqual()) System.out.println("Distance between both the coordinates are - "+point.calculateDistance());
        if(point.isEqual()) System.out.println("No distance! Points are same");





    }

}
