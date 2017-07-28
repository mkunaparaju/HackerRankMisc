/**
 * 
 */
package HackerRankMisc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author mkunaparaju
 *
 */
public class VisaMakeEqualElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VisaMakeEqualElements v = new VisaMakeEqualElements();
		int [] in ={56, 1,7,9,3,24}; 
		int count = v.equalElements(in);
		System.out.println(count + "count");

	}
	int equalElements(int [] in) {
		int count = 0;
		int middle = 0;
		int l = in.length;
		Arrays.sort(in);
		
		if(l %2 != 0) {
			
			middle = (l - 1) / 2;
		}
		else {
			int diff1 = in[(l/2) - 1] - in[0];
			int diff2 = in[l-1] - in[l/2];
			if( diff1 >= diff2) middle = l/2 -1;
			else middle = l/2;
		}
		
		for( int i = 0; i < l; i++) {
			count = count + Math.abs(in[i] - in[middle]);
			in[i] = in[middle];
			System.out.println(i + " in[i] " + in[i]);
		}
		
		
		return count;
	}
	
	
}
