// Program to demonstrate trernery opertaor in java
// ternery operator is a short hand operator for if-else statement
// Syntax: (condition) ? statement1 : statement2
// If condition is true then statement1 will be executed else statement2 will be executed
// Abhijit Zende

package notes.basic_java_programs;

public class ternery_operator_ex {
    public static void main(String[] args){
        int a = 10, b = 20;
        // Syntax: (condition) ? statement1 : statement2
        int max = (a > b) ? a:b;
        // If a > b is true then a will be set to max else b will be set to max
        System.out.println("Maximum of "+a+" and "+b+" is: "+max);
    }
}
