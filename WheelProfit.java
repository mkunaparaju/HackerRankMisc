/**
 * 
 */
package Moodys;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author mkunaparaju
 *
 */
public class WheelProfit {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int x = in.nextInt();
	        int m = in.nextInt();
	        float profit = 0; 
	        for(int a0 = 0; a0 < n; a0++){
	            int w = in.nextInt();
	            int p = in.nextInt();
	            
	            float singleProfit = x - w;
	            float singleProbProfit = singleProfit * p /100;
	            profit = profit + singleProbProfit;

	            
	        }
	        
	        profit = profit * m;
	        in.close();
	        System.out.println(profit);
	        
	        
	        
	    }

}
