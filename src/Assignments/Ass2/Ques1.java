/*Q1. Display food menu to user. User will select items from menu along with the quantity. (eg 1.
Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
(No need of any class, and no need to display the food details. Only display the total of orderd
food)*/

package Assignments.Ass2;

import java.util.Scanner;
class Menu {

    void displayMenu(int totalBill) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---MENU---");
        System.out.println("1. Dosa -> Rs. 50");
        System.out.println("2. Idli -> Rs. 30");
        System.out.println("3. Vada -> Rs.30");
        System.out.println("4. Pizza -> Rs.90");
        System.out.println("5. Burger -> Rs.60");
        System.out.println("6. Samosa -> Rs.15");
        System.out.println("7. Kachori -> Rs.15");
        System.out.println("8. Paw Bhaji -> Rs.50");
        System.out.println("9. Puri Sabzi -> Rs.40");
        System.out.println("10. Generate Bill & Exit");

        System.out.print("Enter Items:- ");
        int choice = sc.nextInt();
        choiceMenu(totalBill,choice);
    }
    void choiceMenu(int totalBill, int choice) {
        switch(choice) {

            case 1:
                totalBill += 50;
                displayMenu(totalBill);
                break;
            case 2:
                totalBill += 30;
                displayMenu(totalBill);
                break;
            case 3:
                totalBill += 30;
                displayMenu(totalBill);
                break;
            case 4:
                totalBill += 90;
                displayMenu(totalBill);
                break;
            case 5:
                totalBill += 60;
                displayMenu(totalBill);
                break;
            case 6:
                totalBill += 15;
                displayMenu(totalBill);
                break;
            case 7:
                totalBill += 15;
                displayMenu(totalBill);
                break;
            case 8:
                totalBill += 50;
                displayMenu(totalBill);
                break;
            case 9:
                totalBill += 40;
                displayMenu(totalBill);
                break;
            case 10:
                System.out.println("Your bill is:- Rs."+totalBill);
                break;
            default:
                System.out.println("You entered wrong choice!!");
                break;
        }
    }

}
public class Ques1 {

    public static void main(String[] args) {
        int totalBill = 0;
        Scanner sc = new Scanner(System.in);

        Menu m = new Menu();
        m.displayMenu(totalBill);









    }

}
