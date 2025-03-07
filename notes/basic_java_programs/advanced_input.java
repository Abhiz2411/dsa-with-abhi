package notes.basic_java_programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class advanced_input {
    public static void main(String[] args){
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        try{
            System.out.print("Enter your name: ");
            String name = br.readLine();
            
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter your 10th percentage: ");
            double percentage = Double.parseDouble(br.readLine());

            System.out.println("Hello "+name+"! having age "+age+" with "+percentage);
        }catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }
    }
}