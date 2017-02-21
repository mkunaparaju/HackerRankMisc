package HackerRankMisc;
import java.util.*;

class Student {
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

//@Override
//	public int compareTo(Student s) {
//		if(this.cgpa > s.cgpa) return -1;
//		else if(this.cgpa < s.cgpa) return 1;
//		else {
//			if((this.fname).compareTo(s.fname) == 0) {
//				if(this.id < s.id) return -1;
//				else if(this.id > s.id) return 1;
//				else return 0;
//			}
//			else {
//				return this.fname.compareTo(s.fname);
//			}		
//		}
//	}
}

class Checker implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getCgpa() > s2.getCgpa()) return -1;
		else if(s1.getCgpa() < s2.getCgpa()) return 1;
		else {
			if(s1.getFname().compareTo(s2.getFname()) == 0) {
				if(s1.getId() < s2.getId()) return -1;
				else if(s1.getId() > s2.getId()) return 1;
				else return 0;
			}
			else {
				return s1.getFname().compareTo(s2.getFname());
			}		
		}
	}
	
}
//write a new class with a comparator
public class JavaSortHR 
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      Checker c= new Checker();
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      	studentList.sort(c);
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }


}
