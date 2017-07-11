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
public class JavaListHR {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int tests = sc.nextInt();
		for(int i = 0; i < tests; i++) {
			String oper = sc.next();
			if(oper.equalsIgnoreCase("insert")) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				list.add(x, y);
			}
			if(oper.equalsIgnoreCase("delete")) {
				list.remove(sc.nextInt());
			}
		}
		
		for(int i : list) {
			System.out.print(i + " ");
		}
	}
}
