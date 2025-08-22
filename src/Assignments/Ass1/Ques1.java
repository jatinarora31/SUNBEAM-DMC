package Assignments.Ass1;
import java.util.Scanner;
public class Ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. - ");
        int n = sc.nextInt();
        Integer i = n;
        System.out.println("Binary - "+Integer.toBinaryString(i));
        System.out.println("Octal - "+Integer.toOctalString(i));
        System.out.println("Hexadecimal - "+Integer.toHexString(i));

    }

}
