/*Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length. and
throws an exception of type ExceptionLineTooLong in the case where a string of length is more
than 80 characters.
(Hint - Use String class length() method)*/

package Assignments.corejava.Ass5;


import java.util.Scanner;
class Validates{
    public void validate() throws ExceptionLineTooLong {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String less than 80 characters: ");
        String s = sc.nextLine();
        if(s.length()>80) {
            throw new ExceptionLineTooLong("The string is too long");
        }
        System.out.println("String: "+s);

    }
}
public class Ques1 {

    public static void main(String[] args) {
        Validates val = new Validates();
        try{
            val.validate();
        } catch (ExceptionLineTooLong e) {
            e.printStackTrace();
        }

    }
}
