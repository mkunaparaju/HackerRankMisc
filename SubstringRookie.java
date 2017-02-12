/**
 * 
 */
package HackerRankMisc;

import java.util.Scanner;

/**
 * @author mkunaparaju
 *
 */
public class SubstringRookie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        String hr = "hackerrank";
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            System.out.println(s);
	            int index = 0;
	            boolean [] lFound = new boolean [hr.length()];
	            for(int i = 0; i< hr.length(); i++)	{
	            	char letter = hr.charAt(i);
	            	while(index < s.length())	{
	            		if(s.charAt(index) == letter)	{
	            			lFound[i] = true;
	            			index++;
	            			break;
	            		}
	            		index++;
	            	}
	            }
	            
	           String isFound = "YES"; 
	            for(int i = 0; i < lFound.length; i++)	{
	            	if(!lFound[i]){
	            		isFound = "NO";
	            		break;
	            	}
	            }
	            System.out.println(isFound);
	        }
	        in.close();
	}

}
