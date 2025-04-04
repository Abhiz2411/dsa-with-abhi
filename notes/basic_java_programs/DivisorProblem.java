package notes.basic_java_programs;

import java.util.ArrayList;

public class DivisorProblem {
    public static int findSum(int n, ArrayList<Integer> arr) {

		// Write your code here
		int sum = 0;
		for(int i=0;i<n;i++){
			if(arr.get(i)%2==0 || arr.get(i)%3==0){
				sum+= arr.get(i);
			}
		}
		return sum;
	}

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        // arr.add(8);

        int n = arr.size();

        System.out.println(findSum(n, arr));
    }
}
