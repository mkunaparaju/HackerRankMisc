/**
 * 
 */
package HackerRankMisc.Java;

import java.util.Scanner;

/**
 * @author mkunaparaju
 *
 */
public class JavaDSBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JavaDSBasic j = new JavaDSBasic();
	

	}
	
	void subArray() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0; 
		for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                
                int sum = 0;
                
                for(int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                
                if(sum < 0) {
                    count++;
                }
            }
        }
		sc.close();
		System.out.println(count);
		
	}



	
}
