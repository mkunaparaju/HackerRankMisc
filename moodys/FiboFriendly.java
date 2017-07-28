/**
 * 
 */
package HackerRankMisc.moodys;

import java.math.BigInteger;
import java.util.*;


/**
 * @author mkunaparaju
 *
 */
public class FiboFriendly {
	
	private static Map<Long, String> results = new HashMap<Long, String>();
	private static Set<BigInteger> fiboNumbers = new HashSet<BigInteger>();
	private static final BigInteger zero = new BigInteger(String.valueOf(0));
	private static final BigInteger one = new BigInteger(String.valueOf(1));
	
	
	static long solve(long n){
		
		BigInteger fiboNum = new BigInteger(getFiboNum(n));
		System.out.println("fibo num " + fiboNum);
		if(isFiboFriendly(fiboNum)) {
			System.out.println("is true" );
			return n;
		}
		//return solve (n+1);
		return n;
	}
	
	static boolean isFiboFriendly(BigInteger fiboNum) {
		
		long [] digitFreq = new long [10];
		
		boolean fiboFriendly = false;
		while(fiboNum.compareTo(zero) > 0) {
			int digit = (fiboNum.mod(new BigInteger("10"))).intValue();
			//System.out.println("digit" + digit);
			digitFreq[digit]++;
			fiboNum = fiboNum.divide(new BigInteger("10")); 
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

	static String getFiboNum(long n) {
	  if (n == 0) {
		 // fiboNumbers.add(zero);
		  results.put(n, "0");
		  return "0";
	  } else if (n <= 2) { // if
		 // fiboNumbers.add(one);
		  results.put(n, "1");
		  return "1";
	  }
	  if (results.get(n) != null) {
		  //System.out.println();
		  return results.get(n);
	    
	  } else {
	    String v = ((new BigInteger(getFiboNum(n - 1))).add(new BigInteger(getFiboNum(n - 2)))).toString();
	    //System.out.println(v + "integers");
	    results.put(n, v);
	    //fiboNumbers.add(v);
	    return v;
	  }
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
