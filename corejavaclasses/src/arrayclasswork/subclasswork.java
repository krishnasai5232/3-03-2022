package arrayclasswork;

import java.util.Scanner;

public class subclasswork {
	  public static void main(String[] args) {

	       Scanner scn = new Scanner(System.in);
	       int[] arr = new int[scn.nextInt()];
	       int target = scn.nextInt();

	       for (int i = 0; i < arr.length; i++) {
	           arr[i] = scn.nextInt();
	       }

	       solve(arr, target);

	   }

	   public static void solve(int[] arr, int target)
	   {
	       for(int start = 0; start < arr.length; start++)
	       {
	           int currSum = 0;
	           for(int end = start; end < arr.length; end++)
	           {
	               currSum += arr[end];
	               if(currSum == target)
	               {
	                    System.out.println("starting index : " +
	                                start + ", " + "Ending index : " + end);

	               }

	           }
	       }
	   }
}
