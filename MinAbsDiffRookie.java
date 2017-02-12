/**
 * 
 */
package HackerRankMisc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mkunaparaju
 *
 */
public class MinAbsDiffRookie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
       Arrays.sort(a);
       int min = Integer.MAX_VALUE;
       int val = 0;
       for(int i = 0; i < n - 1; i++)	{
    	  val = a[i] - a[i+1];
    	  val = Math.abs(val);
    	   if(val < min)	{
    		   min = val;
    	   }
       }
       System.out.println(min);
    }

}
