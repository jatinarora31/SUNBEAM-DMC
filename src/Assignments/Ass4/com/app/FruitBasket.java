/*Q1. Apply inheritance n polymorphism
a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy
b) Properties (instance variables) : color : String , weight : double , name:String,
isFresh : boolean
c) Add suitable constructors.
d) Override toString correctly to return state of all fruits (including : name ,color , weight )
e) Add a taste() method : public String taste()
For Fruit : it should return "no specific taste"
Apple : should return "sweet n sour"
Mango : should return "sweet"
Orange : should return "sour"
f) Add all of above classes under the package "com.app.fruits"
g) Create a Class FruitBasket , with main method inside it. Use it for testing
h) Prompt user for the basket size n create suitable data structure and give options
0. Exit
1. Add Mango
case 1 : boundary checking
basket[counter++]=new Mango(nm,weight,color);
break;
2. Add Orange
3. Add Apple
NOTE : You will be adding a fresh fruit in the basket , in all of above options.
4. Display names of all fruits in the basket.
eg : for-each --- null checking --getName()
5. Display name,color,weight , taste of all fresh fruits , in the basket.
eg : for-each , null checking --toString , taste, isFresh : getter
6. Display tastes of all stale(not fresh) fruits in the basket.
7. Mark a fruit as stale
i/p : index
eg : setter : isFresh : false
o/p : error message (in case of invalid index) or mark it stale
8. Mark all sour fruits stale (optional)
eg : for-each , taste --equals(String)*/

package Assignments.Ass4.com.app;

import java.util.Scanner;


class FruitBasket {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of basket: ");
        int n = sc.nextInt();
        Fruit[] basket = new Fruit[n];

        Fruit f = new Fruit();

        int choice;
        int counter=0;

        while((choice = f.menuDriven()) != 0) {
            switch(choice) {

                case 1:   //Add mango
                    if(basket[basket.length-1] == null) {
                        System.out.println("Enter the details of Mango: ");
                        f.accept(f.name,f.color, f.weight,f.taste,f.isFresh);
                        if(f.isFresh) {
                            basket[counter++] = new Mango(f.name,f.color, f.weight,f.taste,f.isFresh);
                            System.out.println("---[[MANGO ADDED SUCCESSFULLY]]---");
                        }
                    } else System.out.println("---[[BASKET IS FULL]]---");
                    break;

                case 2:   //Add Orange
                    if(basket[basket.length-1] == null) {
                        System.out.println("Enter the details of Orange: ");
                        f.accept(f.name,f.color, f.weight,f.taste,f.isFresh);
                        if(f.isFresh) {
                            basket[counter++] = new Orange(f.name,f.color, f.weight,f.taste,f.isFresh);
                            System.out.println("---[[ORANGE ADDED SUCCESSFULLY]]---");
                        }
                    } else System.out.println("---[[BASKET IS FULL]]---");
                    break;

                case 3:   //Add AppleSystem.out.println("Hello2");
                    if(basket[basket.length-1] == null) {
                        System.out.println("Enter the details of Apple: ");
                        f.accept(f.name,f.color, f.weight,f.taste,f.isFresh);
                        if(f.isFresh) {
                            basket[counter++] = new Apple(f.name,f.color, f.weight,f.taste,f.isFresh);
                            System.out.println("---[[APPLE ADDED SUCCESSFULLY]]---");
                        }
                    } else System.out.println("---[[BASKET IS FULL]]---");
                    break;

                case 4:   //Display names of all fruits in the basket
                    if(basket[0] != null) {
                        System.out.println("Displaying name of all fruit: ");
                        for(Fruit fruit:basket) {
                            if(fruit != null) {
                                System.out.println(fruit.name);
                            }
                        }
                    }
                    if(basket[0] == null) {
                        System.out.println("---[[NO FRUIT PRESENT]]---");
                    }
                    break;

                case 5:   //Display name,color,weight,taste of all fresh fruits in the basket
                    if (basket[0] != null) {
                        System.out.println("Displaying name,color,weight,taste of all fruits present in basket: ");
                        for(Fruit fruit : basket) {
                            if(fruit != null && fruit.isFresh) {
                                System.out.println(fruit.toString());
                            }
                        }
                    }
                    if(basket[0] == null) {
                        System.out.println("---[[NO FRESH FRUIT PRESENT]]---");
                    }
                    break;

                case 6:   // Display tastes of all stale(not fresh) fruits in the basket.
                    for(Fruit fruit : basket) {
                        if(fruit != null) {
                            if(!fruit.isFresh) {
                                System.out.println("{Name: "+fruit.name+" --> Taste: "+fruit.taste+"}");
                            }
                        }
                    }
                    System.out.println("---[[NO STALE FRUIT PRESENT]]---");
                    break;

                case 7: /*Mark a fruit as stale
                        i/p : index
                        eg : setter : isFresh : false
                        o/p : error message (in case of invalid index) or mark it stale*/
                    System.out.print("Enter the index you want to stale the fruit: ");
                    int i = sc.nextInt();
                    if(i < basket.length) {
                        if(basket[i]!=null) {
                            if(basket[i].isFresh) {
                                basket[i].isFresh = false;
                                System.out.println("---[[FRUIT ON GIVEN INDEX GOT STALE]]---");
                            } else {
                                System.out.println("---[[FRUIT IS ALREADY STALE]]---");
                            }
                        } else {
                            System.out.println("---[[ERROR! INVALID INDEX OR NO SUCH FRUIT PRESENT]]---");
                        }
                    } else {
                        System.out.println("---[[YOU ACCESS THE LIMIT OF BASKET]]---");
                    }

                    break;

                case 8: // Mark all sour fruits stale
                    for(Fruit fr: basket) {
                        if(fr.taste.equals("sour")) {
                            for(Fruit fruit : basket) {
                                if(fruit.taste.equals("sour") || fruit.taste.equals("sweet n sour")) {
                                    fruit.isFresh = false;
                                }
                            }
                            System.out.println("---[[ALL SOUR FRUIT GOT STALE]]---");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("---[[WRONG CHOICE]]---");
            }


        }

    }

}


