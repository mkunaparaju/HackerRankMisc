/**
 * 
 */
package HackerRankMisc.Java;

import java.util.Scanner;

/**
 * @author mkunaparaju
 *
 */
public class JavaArray2HR {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 0; i < testCases; i++ ) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [] arr = new int[n];
			for(int j = 0; j < n; j++ ) {
				arr[j] = sc.nextInt();
			}
			String gameWon = isGameWon(m, arr, 0) ? "YES" : "NO";
			System.out.println(gameWon);
		}
	}
	
//	static boolean isGameWon(int [] arr, int m, int index) {
//		
//		if(index < 0 || arr[index] == 1) return false;
//		if((index == arr.length - 1) || (index + m) > arr.length) return true;
//		arr[index]  = 1;
//		return isGameWon(arr, m, index + 1) || isGameWon(arr, m, index -1) || isGameWon(arr, m, index + m)  ;
//		
//	}
	
	private static boolean isGameWon( int m, int[] arr,  int i) {
	    if (i < 0 || arr[i] == 1) return false;
	    if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

	    arr[i] = 1;
	    return isGameWon(m, arr, i + 1) || isGameWon(m, arr, i - 1) || isGameWon(m, arr, i + m);
	}
}
