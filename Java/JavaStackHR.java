/**
 * 
 */
package HackerRankMisc.Java;

import java.util.*;

/**
 * @author mkunaparaju
 *
 */
public class JavaStackHR {
	public static void main(String []argh) {
		Scanner sc = new Scanner(System.in);
	    while (sc.hasNext()) {
	    	String input=sc.next();
	    	Stack<Character> stack = new Stack<Character>();
	    	boolean check = true;
	    	for(int i = 0; i < input.length(); i++) {
	    		if((input.charAt(i) == '{') || (input.charAt(i) == '[') || (input.charAt(i) == '(' || stack.isEmpty())) {
	    			stack.push(input.charAt(i));
	    			continue;
	    		}
	    		if(input.charAt(i) == '}') {
	    			if(stack.peek() == '{') {
	    				stack.pop();
	    			}
	    			else {
	        			System.out.println("false");
	        			check = false;
	        			break;
	    			}	
	    		}
	    		if(input.charAt(i) == ']') {
	    			if(stack.peek() == '[') {
	    				stack.pop();
	    			}
	    			else {
	        			System.out.println("false");
	        			check = false;
	        			break;
	    			} 
	    		}
	    		if(input.charAt(i) == ')') {
	    			if(stack.peek() == '(') {
	    				stack.pop();
	    			}
	    			else {
	        			System.out.println("false");
	        			check = false;
	        			break;
	    			}
	    		}			    		
	    	}
	    	if(stack.isEmpty())   	System.out.println("true");
	    	else { 
	    		if(check) System.out.println("false");
	    	}
	    	
	    	
	    	
	    }
	      
	   }
}
