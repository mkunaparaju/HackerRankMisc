/**
 * 
 */
package HackerRankMisc;

import java.util.Scanner;

/**
 * @author mkunaparaju
 *
 */
public class InsertionSort {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         insertIntoSorted(ar);
	    }
	    
	    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	    
	public static void insertIntoSorted(int[] ar) {
	     int length = ar.length;  
		 int lastNum = ar[length-1];
		 int pos = length - 1;
		 while(pos > 0) {
			 if(lastNum < ar[pos - 1]) {
				 ar[pos] = ar[pos-1];
				 pos = pos - 1;
			 }
			 else break;
			 printArray(ar);
		 }
		 ar[pos] = lastNum;
		 printArray(ar);
	 }
}
