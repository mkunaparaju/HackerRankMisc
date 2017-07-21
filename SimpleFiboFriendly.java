/**
 * 
 */
package Moodys;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author mkunaparaju
 *
 */
public class SimpleFiboFriendly {

	static long solve(long n){
		if(isFiboFriendly(n)) {
			return n;
		}
		return solve (n+1);
		
	}
	
static boolean isFiboFriendly(long fiboNum) {
		
		long [] digitFreq = new long [10];
		boolean fiboFriendly = false;
		while(fiboNum > 0) {
			int digit = (int) (fiboNum%10);
			//System.out.println("digit" + digit);
			digitFreq[digit]++;
			fiboNum = fiboNum / 10; 
			//System.out.println(fiboNum + "divided one");
		}
		
		for( int i = 0; i < digitFreq.length; i++ ) {
			long freqNum = digitFreq[i];
			//System.out.println("freqNum " + freqNum + "digit " + i );
			if(freqNum  == 0 || freqNum == 1) fiboFriendly = true;
			else {
			fiboFriendly  = isFibonacci(freqNum);
			//System.out.println(fiboFriendly);
			if(!fiboFriendly) return fiboFriendly;
			}
		}
		
		return fiboFriendly;
	}
	
	static  boolean isPerfectSquare(long x)
    {
        long s = (long) Math.sqrt(x);
        return (s*s == x);
    }
      
    // Returns true if n is a Fibonacci Number, else false
    static boolean isFibonacci(long n)
    {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5*n*n + 4) ||
               isPerfectSquare(5*n*n - 4);
    }
    
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for(int a0 = 0; a0 < q; a0++){
			long n = in.nextLong();
			long result = solve(n);
			System.out.println(result + " ");
	        }
		in.close();
	    }
}
