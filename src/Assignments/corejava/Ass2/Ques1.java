/*Q1. Display food menu to user. User will select items from menu along with the quantity. (eg 1.
Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
(No need of any class, and no need to display the food details. Only display the total of orderd
food)*/

package Assignments.corejava.Ass2;

import java.util.Scanner;
class Menu {

    int dosa = 50;
    int idli = 30;
    int vada = 30;
    int pizza = 90;
    int burger = 60;
    int samosa = 15;
    int kachori = 15;
    int pawBhaji = 50;
    int puriSabzi = 40;

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
                totalBill += dosa;
                displayMenu(totalBill);
                break;
            case 2:
                totalBill += idli;
                displayMenu(totalBill);
                break;
            case 3:
                totalBill += vada;
                displayMenu(totalBill);
                break;
            case 4:
                totalBill += pizza;
                displayMenu(totalBill);
                break;
            case 5:
                totalBill += burger;
                displayMenu(totalBill);
                break;
            case 6:
                totalBill += samosa;
                displayMenu(totalBill);
                break;
            case 7:
                totalBill += kachori;
                displayMenu(totalBill);
                break;
            case 8:
                totalBill += pawBhaji;
                displayMenu(totalBill);
                break;
            case 9:
                totalBill += puriSabzi;
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
