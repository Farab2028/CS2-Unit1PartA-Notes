// import statements always go at the top of the file 

import java.util.Scanner;

public class Main {
   /*
   This is my comment space
   */

   public static void main(String []args) {
     System.out.println("It makes no sense to divide a number by zero!");
System.out.println(0/3);

// we can use println or print to produce output
System.out.print("Hi ");
System.out.print("there");
System.out.print("!");

// we can print special characters using an escape sequece \
System.out.println("\"");
System.out.println("\\");
System.out.println("I love computer science. \nIt is so cool.");

// example with all three escape sequence


// math operatoes + - * /
// when we do int division, it trumcates our answer. It returns an int.
int x = 5;
int y = 3;

//System.out.println(x/y);

// % gives us the remiander
//System.out.println(x%y);

x = 6;
y = x;
x = 8;

// we can also update variable assignments by incrementing and decrementing
// incrementing adds 1 to our value
// decrementing subtracts 1 from our value

x = x + 1;
// updates our variable even without the equal sign 
x++;
x = x - 1;
// x-- updates our variable even without the equal sign
x--;

 System.out.println("Please type in a name in the input box below.");
Scanner scan = new Scanner(System.in);
String name = scan.nextLine();
System.out.println("Hello " + name);
scan.close();

      
   }
}

