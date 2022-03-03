package arrayclasswork;

import java.util.Scanner;

public class arraysplitclasswork {
	 static void pprint(int arr[])
	    {
	        for (int var : arr) {
	            System.out.print(var + " ");
	        }
	 
	        System.out.println();
	    }
	 
	    public static void main(String args[])
	    {
	        int a[] = { 2,5,2,4,3,6,4,6,7,4};       
	        int n = a.length;
	 
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter position to split.");
	 
	        int pos = scanner.nextInt();       
	        if (pos > 0 && pos < n) {
	          
	            int b[] = new int[pos];
	            int c[] = new int[n - pos];
	            
	            for (int i = 0; i < pos; i++) {
	                b[i] = a[i];
	            }
	            
	            for (int i = 0; i < n - pos; i++) {
	                c[i] = a[i + pos];
	            }
	 
	            pprint(b);
	            pprint(c);
	        }
	        else {
	            System.out.println("Invalid position.");
	         }
	    }
	}


