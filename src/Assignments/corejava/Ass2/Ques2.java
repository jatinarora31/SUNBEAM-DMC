/*Q2. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/

package Assignments.corejava.Ass2;

import java.util.Scanner;

class Item{

    private String itemNo;
    private String desc;
    private int quantity;
    private double amount;

    public Item() {
    }

    public Item(String itemNo, String desc, int quantity, double amount) {
        this.itemNo = itemNo;
        this.desc = desc;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

public class Ques2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        Item item = new Item();
        System.out.println("Enter the item no.:- ");
        String no = sc.nextLine();
        System.out.println("Enter the Description:- ");
        String des = sc.nextLine();
        System.out.println("Enter the Quantity:- ");
        int quan = sc.nextInt();
        System.out.println("Enter the Price per quantity:- ");
        double price = sc.nextDouble();

        item.setItemNo(no);
        item.setDesc(des);
        item.setQuantity(quan);
        item.setAmount(price);


        System.out.println("Item no:- "+item.getItemNo());
        System.out.println("Item Description:- "+item.getDesc());
        System.out.println("Quantity of items:- "+item.getQuantity());
        System.out.println("Total amount:- "+item.getQuantity()*item.getAmount());

    }

}
