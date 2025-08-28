package Assignments.Ass4.com.app;

import java.util.Scanner;

class Fruit {

    String color;
    double weight;
    String name;
    boolean isFresh;
    String taste;


    Fruit() {

    }
    Fruit(String name, String color, double weight, String taste, boolean isFresh){

        this.name = name;
        this.color = color;
        this.weight = weight;
        this.taste = taste;
        this.isFresh = isFresh;
    }

    public String taste(String taste) {
        return taste;
    }

    public String toString() {
        return "{Name: "+name+", " +
                "Color: "+color+", " +
                "Weight: "+weight+", " +
                "Taste: "+taste(taste)+"}";
    }

    public int menuDriven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("0. EXIT");
        System.out.println("1. Add Mango");
        System.out.println("2. Add Orange");
        System.out.println("3. Add Apple");
        System.out.println("4. Display name of all fruits");
        System.out.println("5. Display name, color, weight, taste of all fresh fruits");
        System.out.println("6. Display Taste of all stale(not-fresh) fruit");
        System.out.println("7. Mark a fruit as stale");
        System.out.println("8. Mark all sour fruit stale");
        System.out.print("Enter your choice - ");
        return sc.nextInt();


    }

    // String name,String color, double weight, String taste, boolean isFresh

    public void accept(String name,String color,double weight,String taste,boolean isFresh) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of fruit: ");
        this.name = sc.nextLine();
        System.out.print("Enter color of fruit: ");
        this.color = sc.nextLine();
        System.out.print("Enter weight of fruit: ");
        this.weight = sc.nextInt();
        System.out.print("Enter taste of fruit: ");
        this.taste = sc.nextLine();
        this.taste = sc.nextLine();
        System.out.print("Enter 'true' if food is fresh and 'false' if food is stale: ");
        this.isFresh = sc.nextBoolean();


    }
}
