package HackerRankMisc.Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import HackerRankMisc.Java.Student;


public class JavaPriorityHR {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      PriorityQueue<Student> pq = new PriorityQueue<Student>();
      
      while(totalEvents>0){
         String event = in.next();
         if(event.equalsIgnoreCase("enter")) {
             String name = in.next();
             double cgpa = in.nextDouble();
             int id = in.nextInt();       
             Student s = new Student(id, name, cgpa);
             pq.add(s);
//             pq.po`
             //System.out.println(pq.size());
         }
         if(event.equalsIgnoreCase("served")) {
        	pq.poll();
         }
           totalEvents--;
      }
     // System.out.println("fdfjdkl");
      if (pq.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			while (!pq.isEmpty()) {
				System.out.println(pq.poll().getFname());
			}
		}
    }
}
