package dsa.logic_building;

public class NStarPyramid {
    public static void printNStarPyramid(int n) {
        // Write your code here
        int x = 0;                          // loop cond. var for star 
        for(int i=n;i>0;i--){               // Loop for number of rows
            for(int j=i-1;j>0;j--){         // Loop for empty space
                System.out.print(" ");               
            }
            int starCondLoopVar = (2*x+1); 
            for(int k=0;k<starCondLoopVar;k++){        // Loop for star
                System.out.print("*");
            }
            x = x+1;
            System.out.println();           // For next line
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printNStarPyramid(n);
    }
}
