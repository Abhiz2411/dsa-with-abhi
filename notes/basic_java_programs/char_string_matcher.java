// This program is incomplete

package notes.basic_java_programs;

import java.util.Scanner;

public class char_string_matcher {
    public static void main(String[] args){
        String sentences[] = {"hello world!", "java is a programming language", "abhijit zende"};
        int times[] = {3,1,2};
        Scanner sc = new Scanner(System.in);
        String search;
        do{
            System.out.println("Enter a character to search in the sentences: ");
            System.out.println("Enter # to exit");
            search = sc.nextLine();
            if(search.charAt(-1) == '#') break;
            for(int i=0;i<sentences.length;i++){
                          
            }

        }while(search.charAt(0) != '#');
        
        
        sc.close();
    }
}
