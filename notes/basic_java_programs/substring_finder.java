package notes.basic_java_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class substring_finder {
    public static void main(String[] args) {
        String[] searches = new String[]{"i love you","island","ironman","i love geeksforgeeks"};
        int[] times = new int[]{5,3,2,2};

        System.out.println("Searches: "+Arrays.toString(searches));
        System.out.println("Times: "+Arrays.toString(times));

        Scanner sc = new Scanner(System.in);

        boolean loop_var = true;
        do{
            System.out.print("\nEnter a string: ");
            String search = sc.nextLine();
            // ArrayList<String> matches = new ArrayList<>();
            HashMap<String,Integer> matches = new HashMap<>();
            for(int i=0;i<searches.length;i++){
                if (search.length() <= searches[i].length() && 
                        search.equals(searches[i].substring(0,search.length()))) {
                    System.out.println(searches[i]);
                    // matches.add(searches[i]);
                    matches.put(searches[i],times[i]);        
                } 
            }
            if(matches.size() == 0){
                System.out.println("No matches found!");
            }
            System.out.println("\nAutocomplete suggesstion: "+matches);
            // TreeMap<String,Integer> sorted_matches = new TreeMap<>(matches.values());

            System.out.print("\nDo you want to continue true/false: ");
            loop_var = sc.nextBoolean();
            sc.nextLine(); // Consume the newline character left by nextBoolean()
        }while(loop_var);
        sc.close();
    }
}
