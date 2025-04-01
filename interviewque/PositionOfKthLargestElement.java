// Code by Abhijit Zende: https://www.abhijitzende.com/
// Find the position  of kth largest element from an unsorted array
// Input:
// 1. Unsorted array
// 2. K: integer representing rank of highest element in the array
// Output: Return the index of Kth highest element from the original unsorted array

package interviewque;

import java.util.Arrays;

public class PositionOfKthLargestElement{
    public static void main(String[] args){
        int[] unArray = {4,1,3,2,5};            // Input 1: Unsorted array
        int k = 3;                              // Input 2: Rank of Kth largest element
        System.out.println("Unsorted array: "+Arrays.toString(unArray));
        System.out.println("K: "+k);
        System.out.println("Index of "+k+(k==1?"st":k==2?"nd":k==3?"rd":"th")+" largest element: "+returnIndexOfKthLargestElement(unArray,k));    // O/p: Index of Kth largest element form i/p array
    }

    static int returnIndexOfKthLargestElement(int[] unArray,int k){
        int[] sortedArray = Arrays.copyOf(unArray, unArray.length);     // Copy of original array
        Arrays.sort(sortedArray);                                       // Sorting copied array
        int kLargestElement = sortedArray[sortedArray.length - k];      // Getting Kth largest element from sorted array
        int _i;      
        for(_i=0;_i<unArray.length;_i++){
            if(unArray[_i] == kLargestElement){
                break;
            }
        }
        return _i+1;
    }
}