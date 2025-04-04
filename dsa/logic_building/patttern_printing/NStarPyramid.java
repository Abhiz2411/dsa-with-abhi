package dsa.logic_building.patttern_printing;

public class NStarPyramid {

    public static void nStarTriangle(int n) {
        int stars = 1; // Tracks the number of stars to print in each row

        // Loop through each row
        for (int i = 0; i < n; i++) {

            // Print leading spaces (decreasing order)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars (odd numbers: 1, 3, 5, ...)
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();

            // Increase the star count by 2 (to maintain odd sequence)
            stars += 2;
        }
    }

    // Driver method to test the function
    public static void main(String[] args) {
        int n = 5; // Example input
        nStarTriangle(n);
    }
}