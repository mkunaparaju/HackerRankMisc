package HackerRankMisc.Java;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.text.*;
import java.math.*;
import java.time.*;
import java.time.LocalDate;

class Student implements Comparable<Student>{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	   @Override
	   public int compareTo(Student p) {
			if(this.getCgpa() ==  p.getCgpa()) {
	            if(this.getFname().equals(p.getFname())){
	                if(this.getId() > p.getId()) return 1;
	                else return -1;
	            }
	            else return this.getFname().compareTo(p.getFname()); 
	            }
	       else if(this.getCgpa() >  p.getCgpa()) return -1;
	       else if (this.getCgpa() <  p.getCgpa()) return 1;
	       
			return 0;
		}
	    
	}

public class BasicExamples {

    public static void main(String[] args) {
       BasicExamples b = new BasicExamples();
       //b.dayOfWeek();
       //b.stringIntro();
       //b.SubStringComp();
      // b.anagrams();
       //b.patternMatching();
       //b.tagExtraction();
       //System.out.println("new print!!!");
      
     
    }
    //string split
    void splitStr() {
    	 String s = "      ";
       String trimStr = s.trim();
       if(trimStr.isEmpty()) {
    	   System.out.println("0"); 
    	   return;
       }
       String [] splitStr = trimStr.split("[ .,?!'@_]+");
       System.out.println(splitStr.length);
       for(int i =0 ; i < splitStr.length; i++ ) {
          System.out.println(splitStr[i]);
       }
    }
    //date time general
    void dayOfWeek()	{
    	Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        LocalDate ld = LocalDate.of(year, month, day);
        String name = ld.getDayOfWeek().toString();
        System.out.println(name);
        in.close();
    }
 
    void stringIntro() {
    	Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sumL = A.length() + B.length();
        String isLexGreater = (A.compareToIgnoreCase(B) > 0) ? "Yes" : "No";
        String update = A.substring(0, 1).toUpperCase() + A.substring(1) + " " +  B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(sumL);
        System.out.println(isLexGreater);
        System.out.println(update);
    }
    /// Java Substring Comparisons -
    void SubStringComp()	{
    	Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> subStrs = new ArrayList<String>();
        for(int i = 0; i <= s.length() - k; i++)	{
        	subStrs.add(s.substring(i, i+k));
        	System.out.println(s.substring(i, i+k));
        }
        
        Collections.sort(subStrs);
        smallest = subStrs.get(0);
        largest = subStrs.get(subStrs.size() - 1);
        return smallest + "\n" + largest;
    }
    // string anagrams
    
    void anagrams() {
    	Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    	
    }
    static boolean isAnagram(String a, String b) {
    	if(!(a.length() == b.length())) return false;
    	
    	HashMap<Character, Integer> mapLetter = new HashMap<Character, Integer>();
    	for(int i = 0; i < a.length(); i++) {
    		char letter = a.toLowerCase().charAt(i);
    		if(mapLetter.containsKey(letter)) {
    			int val = mapLetter.get(letter);
    			val++;
    			mapLetter.remove(letter);
    			mapLetter.put(letter, val);
    		}
    		else {
    			mapLetter.put(letter, 1);
    		}
    	}
    	
    	for(int i = 0; i < b.length(); i++) {
    		char letter = b.toLowerCase().charAt(i);
    		if(mapLetter.containsKey(letter)) {
    			int val = mapLetter.get(letter);
    			val--; 
    			mapLetter.remove(letter);
    			mapLetter.put(letter, val);
    		}
    		
    		else return false; 
    	}
    	
    	for(Integer i : mapLetter.values()) {
    		if (i != 0) return false;
    	}
    	return true;
    }
    //java strings pattern syntax checker
    void patternMatching(){
    	try {
    	   	Pattern p = Pattern.compile("[AZ[a-z](a-z)");
    	   	System.out.println("Valid");
    	}
    	catch (PatternSyntaxException e) {
    		System.out.println("Invalid");
    	}  	
    }
    
   //TAG CONTENT extraction 
    void tagExtraction()	{
    	 Scanner in = new Scanner(System.in);
         int testCases = Integer.parseInt(in.nextLine());
         while(testCases>0){
            String line = in.nextLine();
            int count=0;
            Pattern r = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher m = r.matcher(line);
            while(m.find()) {
                if (m.group(2).length() !=0) {
                    System.out.println(m.group(2));
                count++;
                }
            }
            if (count == 0) System.out.println("None");
           
            testCases--;
         }
         in.close();
    }
    	
}
