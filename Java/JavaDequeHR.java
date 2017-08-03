/**
 * 
 */
package HackerRankMisc.Java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author mkunaparaju
 *
 */
public class JavaDequeHR {
	 public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         Deque<Integer> deque = new ArrayDeque<Integer>();
         int n = in.nextInt();
         int m = in.nextInt();
         int maxUniq = 0; 
         Set<Integer> s = new HashSet<Integer>();
         for (int i = 0; i < n; i++) {
             int num = in.nextInt();
             deque.add(num);
             s.add(num);
             
             if(deque.size() == m) {
            	 if(s.size() > maxUniq) maxUniq = s.size();
            	 int x = deque.pop();
            	 if(!deque.contains(x)) s.remove(x);
             }
         }
         
        
     }
}
