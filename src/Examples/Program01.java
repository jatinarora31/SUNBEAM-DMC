/*Create a menu driven code which has below menus
Create an array of Student of size 5.
Add the dummy records of student in any random order
create the below menus
1. Add Student
2. Display All Students
3. Sort students in natural ordering (use roll no for it)
4. Sort students in desc order of the name
5. Sort students in desc order of the marks*/
package Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student implements Comparable<Student> {

    int rollno;
    String name;
    int marks;

    Student() {
    }
    Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.rollno - o.rollno;

    }

    public int menu(Scanner sc) {
        System.out.println("0. EXIT");
        System.out.println("1. Add Student");
        System.out.println("2. Display all students");
        System.out.println("3. Sort students in natural ordering (use roll no for it)");
        System.out.println("4. Sort students in desc order of the name");
        System.out.println("5. Sort students in desc order of the marks");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll no: ");
        this.rollno = sc.nextInt();
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        this.name = sc.nextLine();
        System.out.print("Enter marks: ");
        this.marks = sc.nextInt();
    }
    public void displayArray(Student[] arr) {
        System.out.println("--------------------------------------------------");
        for (Student e : arr)
            System.out.println(e);
        System.out.println("--------------------------------------------------");
    }
}

public class Program01 {

    public static void main(String[] args) {

        class StudentNameComparator implements Comparator<Student> {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.name.compareTo(s1.name);
            }
        }

        class StudentMarksComparator implements Comparator<Student> {
            @Override
            public int compare(Student s1, Student s2) {
                return -(s1.marks - s2.marks);
            }
        }

        Student s = new Student();
        Student[] arr = new Student[5];
        Scanner sc = new Scanner(System.in);
        int counter=0;
        int choice;
        while((choice = s.menu(sc)) != 0) {
            switch(choice) {
                case 1: //Add Students
//                   if(arr[arr.length-1] == null){
//                       s.accept();
//                       Student student = new Student(s.rollno,s.name,s.marks);
//                       arr[counter++] = student;
//                   } else {
//                       System.out.println("Students is full!!");
//                   }
                    arr[0] = new Student(5, "Mukesh", 20);
                    arr[1] = new Student(3, "Anil", 40);
                    arr[2] = new Student(1, "Ram", 50);
                    arr[3] = new Student(4, "Ramesh", 30);
                    arr[4] = new Student(2, "Suresh", 10);
                    break;
                case 2: // Display students
                    if(arr[0] != null) {
                        for(Student st : arr) {
                            if(st != null) {
                                System.out.println(st);
                            }
                        }
                    }
                    else{
                        System.out.println(("---[[NO STUDENT PRESENT]]---"));
                    }
                    break;
                case 3: // Sort students in natural ordering
                    System.out.println("Before sorting");
                    s.displayArray(arr);
                    Arrays.sort(arr);
                    System.out.println("After sorting");
                    s.displayArray(arr);
                    break;
                case 4: //Sort students in desc order of the name
                    StudentNameComparator nameComparator = new StudentNameComparator();
                    System.out.println("Before sorting");
                    s.displayArray(arr);
                    Arrays.sort(arr,nameComparator);
                    System.out.println("After sorting");
                    s.displayArray(arr);
                    break;
                case 5:
                    StudentMarksComparator marksComparator = new StudentMarksComparator();
                    System.out.println("Before sorting");
                    s.displayArray(arr);
                    Arrays.sort(arr,marksComparator);
                    System.out.println("After sorting");
                    s.displayArray(arr);
                    break;
                default:
                    System.out.println("Wrong choice entered !!");
                    break;
            }

        }



    }
}
