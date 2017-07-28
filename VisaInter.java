/**
 * 
 */
package HackerRankMisc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author mkunaparaju
 *
 */
public class VisaInter {

	/**
	 * @param args
	 */
	 public static void main(String[] args) throws IOException{
	     int [] arr = {4, 1, 2, 3};	  
		 int out = maxDifference(arr);
	      // System.out.println(out);
	       
	       
	     int [] a1 = {1000000000};
	     long [] o1 = maxSubsetSum(a1);
	     
	     
	    }
	
	static int maxDifference(int[] arr) {
		int arr_size = arr.length;
		 int max_diff = arr[1] - arr[0];
	        int min_element = arr[0];
	        
	        for (int i = 1; i < arr_size; i++) 
	        {
	            if (arr[i] - min_element > max_diff)
	                max_diff = arr[i] - min_element;
	            if (arr[i] < min_element)
	                min_element = arr[i];
	        }
	        if( max_diff < 0) return -1;
	        return max_diff;
    }
	
	static long largestSum(int k ) {
		long sum = 0;
	    long leastMult = (long)(Math.sqrt(k));
	 
	    // find all divisors which divides 'N'
	    for (long i = 1; i <= leastMult; i++)
	    {
	        // if 'i' is divisor of 'N'
	        if (k % i == 0)
	        {
	            // if both divisors are same then add
	            // it only once else add both
	            if (i == (k / i))
	                sum += i;
	            else
	                sum += (i + k / i);
	        }
	    }
	 
	    return sum;
	}

	static long[] maxSubsetSum(int[] k) {
		long [] outArr = new long[k.length];
		for(int i = 0; i < k.length; i++) {
			outArr[i] = largestSum(k[i]);
			System.out.println(outArr[i]);
		}
		
		return outArr;
    }
	
	static float[] predictTemperature(String startDate, String endDate, float[] temperature, int n) {
		float [] outArr = new float [n*24];
		float [] mean = new float[temperature.length/24];  
		
		for( int i = 0; i < temperature.length; i++ ) {
			float sum = 0; 
			for(int j = 0; j < 24; j++) {
				sum = sum + temperature[i+j];
			
			}
			mean[i/24] = sum/24;
			sum = 0;
			i = i +24;
		}
		
		float [] [] diff = new float [24][temperature.length/24];
		
		for( int i = 0; i < temperature.length/24; i++ ) {
			for(int j = 0; j < 24; j++) {
				diff[j][i] = mean[i] - temperature[(i*24) + j];
			}
		}
		
		float totalM = 0;
		for(int i = 0; i < mean.length; i++) {
			totalM += mean[i];
		}
		totalM = totalM/mean.length;
		
		for (int i = 0; i < n*24;  i++) {
			
		}
		return outArr;
    }

}
