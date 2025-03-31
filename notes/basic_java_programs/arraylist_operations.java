package notes.basic_java_programs;

import java.util.ArrayList;
import java.util.Collections;;

public class arraylist_operations {
    public static void main(String[] args) {
        // Array list declaration
        ArrayList<String> fruits = new ArrayList<>();
        // Concatinating elements in al 
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        
        // Printing elements of fruits
        System.out.println("Fruits: "+fruits);
        
        // Adding element using index
        fruits.add(2,"Pineapple");
        System.out.println("\nFruits after adding Pineapple at index 2: "+fruits);
        
        // Replacing the element using index
        fruits.set(2, "Mango");
        System.out.println("\nFruits after setting index 2 as Mango: "+fruits);
        
        // Removing the element using the element value 
        fruits.remove("Mango");                            // Only removes first occurrence of the element
        System.out.println("\nFruits after removing Mango: "+fruits);
        
        // Removing element using index
        fruits.remove(2);
        System.out.println("\nFruits after removing 2nd index element: "+fruits);

        // Returning the size of the arraylist
        System.out.println("\nSize of ArrayList fruits: "+fruits.size());

        // Checking if the element exists or not. Returns -1 if element does not exists 
        System.out.println("\nDoes fruits contains Mango: "+fruits.contains("Mango"));

        // Find the index of the first occurence 
        System.out.println("\nThe index of Grapes: "+fruits.indexOf("Grapes"));

        // Sorting the arraylist in ascending order
        Collections.sort(fruits);
        System.out.println("\nFruits after sorting: "+fruits);

        // Sorting the al in descending order 
        Collections.sort(fruits,Collections.reverseOrder());
        System.out.println("\nFruits after sorting in descending order: "+fruits);

        // Clearing the arraylist 
        fruits.clear();
        System.out.println("\nFruits after clearing: "+fruits);

        System.out.println("\nIs fruits empty: "+fruits.isEmpty());
    }
}
