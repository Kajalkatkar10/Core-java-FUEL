import java.util.*;
public class Scanner1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("First Name");
		String fname=sc.nextLine();
		System.out.println("First Name is "+fname);
		
		System.out.println("Last Name");
		String lname=sc.nextLine();
		System.out.println("Last Name is "+lname);
		
		System.out.println("City Name");
		String cname=sc.nextLine();
		System.out.println("City Name is "+cname);
		
		System.out.println("Address ");
		String aname=sc.nextLine();
		System.out.println("Current address is "+aname);
		
		System.out.println("Email Id");
		String ename=sc.nextLine();
		System.out.println("Email Id is "+ename);
		
		System.out.println("Contact number");
		long num=sc.nextLong();
		System.out.println("Contact number is "+num);
		
		System.out.println("DOB");
		String num1=sc.next();
		System.out.println("DOB is "+num1);
		
		System.out.println("Degree");
		String degree=sc.next();
		System.out.println("Degree is "+degree);
		
		System.out.println("percentage");
		double pnum=sc.nextDouble();
		System.out.println("Percentage is "+pnum);
		
		System.out.println("Skills");
		String skills=sc.next();
		System.out.println("My Skills are "+skills);
		
	}
}