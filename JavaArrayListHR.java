/**
 * 
 */
package HackerRankMisc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author mkunaparaju
 *
 */
public class JavaArrayListHR {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        ArrayList<ArrayList<Integer>> inLists = new ArrayList<ArrayList<Integer>>();
	        for(int i = 0; i < n; i++) {
	            ArrayList<Integer> line = new ArrayList<Integer>();
	            int d = sc.nextInt();
	            for(int j = 0; j < d; j++) {
	                line.add(sc.nextInt());
	            }
	            inLists.add(line);
	        }
	        
	        int q = sc.nextInt();
	        for(int i = 0; i < q; i++) {
	            int x = sc.nextInt();
	            int y = sc.nextInt();
	            
	            ArrayList<Integer> line = inLists.get(x-1);
	            if(y > line.size()) {
	                System.out.println("ERROR!");
	                continue;
	            }
	            System.out.println(line.get(y-1));
	            
	        }
	    }
	
}
