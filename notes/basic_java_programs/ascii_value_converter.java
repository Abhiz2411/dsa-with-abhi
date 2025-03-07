// 03
// Basic program to find ASCII values of characters
// Using explicit typecasting from char to integer
// Abhijit Zende

package notes.basic_java_programs;

import java.util.Scanner;

public class ascii_value_converter {
    public static void main(String[] args){
        System.out.print("Enter any character: ");
        Scanner sc = new Scanner(System.in);
        char org_char = sc.nextLine().charAt(0);    // Use nextLine() instead of next() for detecting
                                                          // space as character
        
        System.out.print("ASCII value for "+org_char+" is: "+(int)org_char);
        sc.close();
    }
}
