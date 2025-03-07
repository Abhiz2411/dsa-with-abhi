// 02
// Basic name user input program in Java
// Abhijit Zende

package notes.basic_java_programs;

import java.util.Scanner;

public class basic_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // String name = sc.next();     next() function will only capture the name until space deliminator 
        //                              i.e. next() will capturte only first name
        String name = sc.nextLine();    

        System.out.print("Enter any random character: ");
        char rand_char = sc.next().charAt(0);  // No inbuild method for reading char. 
                                        // To read char instead read charAt(0) from string method sc.next()

        System.out.print("Enter your roll number: ");
        int roll_number = sc.nextInt();

        System.out.print("Are you 18+?: ");
        boolean isAdult = sc.nextBoolean();

        System.out.println("Hello "+name+"! with roll number "+roll_number);
        System.out.print("Are you adult: "+isAdult);
        System.out.print("The random character you entered is: "+rand_char);

        sc.close();
    }
}
