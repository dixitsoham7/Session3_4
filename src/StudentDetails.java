/*Here getters and setters are implemented to access the private data
 * The aim is to print the result of the student along with its details
 * Class student has private data which is accessed by using  getters and setters
 * Result method accepts the marks and returns result
 * the task of printing the result is done by StudentresultProcessing class which extends student class
 * Inheritance, Encapsulation, Constructor are the main concepts implemented here
 * Program is as follows :
 */

import java.util.Scanner;

public class StudentDetails //class to accept the student info
{

	public static void main(String[] args)   //main method
	{		
		Scanner sc=new Scanner(System.in);  // creating object of Scanner class
		StudentResultProcessing ob=new StudentResultProcessing(); // creating object of StudentResultProcessing class
		
		System.out.println("ENTER STUDENT DETAILS\n"); 
		System.out.print("Enter Student Name : ");  //inputing students name
		ob.setName(sc.next()); //storing Student Name
		System.out.print("Enter Student Class : ");  //inputing students class
		ob.setStClass(sc.next()); //storing value for Student class
		System.out.print("Enter Student RollNo : ");  //inputing rollno for student
		ob.setRollNo(sc.nextInt()); //storing students Roll number
		System.out.print("Enter Student Phone No : ");  //inputing phone no of student
		ob.setPhno(sc.nextLong()); //storing Students Phone number
		
		ob.dispResult(); // calling method to print result
	}
	
}
class Student // Base Class for student
{
	//declaring all private member data
	
	private String name;
	private String stclass;
	private int rollno;
	private long phno;
	private float sub1,sub2,sub3;
	private float per;
	public Scanner sc;
	
	public Student() // Constructor of student class
	{
		 sc=new Scanner(System.in);
	}
	
	public String getName() // Getter for Name
	{
		return name;		
	}
	
    public String getStClass() // Getter for Class
	{
		return stclass;
		
	}
    
	public int getRoll() // Getter for RollNo
	{
		return rollno;
	}
	
	public long getphno() // Getter for Phone number
	{
		return phno;
	}
	
	public void setName(String s) // Setter for Name
	{
		name=s;
	}
	
	public void setStClass(String c) // Setter for Class
	{
		stclass=c;
	}
	
	public void setPhno(long p) // Setter for Phone number
	{
		phno=p;
	}
	
	public void setRollNo(int r) // Setter for RollNo
	{
		rollno=r;
	}
	
	//result method to accept value of 3 subjects to calculate the result 
	public String result()
	{   
		rollno=getRoll();
		System.out.print("Enter marks of first subject : ");
		sub1=sc.nextFloat();  // inputing value for the first subject 
		System.out.print("Enter marks of second subject : ");
		sub2=sc.nextFloat();  // inputing value for the second subject 
		System.out.print("Enter marks of third subject : ");
		sub3=sc.nextFloat();  // inputing value for the third subject
		per=((sub1+sub2+sub3)/300)*100;  //calculating percentage
		
		if(per>=50) //if student has percentage more than 50 then he is pass
			return "Pass"; //returning result
		else
			return "Fail";  //if per<50 then fail
	}
}

class StudentResultProcessing extends Student // child Class for printing the result
{ 
	String p;  //creating variable of String data type
	public StudentResultProcessing()  //constructor of child class
	{
		super();  //invoke parent class constructor
	}	
	
	public void dispResult() // method to print the final required result
	{
		p=result(); //to get the value returned by result method
		System.out.println("--------------------------------");
		System.out.println("\nResult Declared as follows : ");
		System.out.println("--------------------------------");
		//here we are printing with the help of getters
		System.out.println("Student Name: "+getName());  //here we are printing with the help of getters
		System.out.println("Student Class: "+getStClass());
		System.out.println("Roll No: "+getRoll());
		System.out.println("Phone Number: "+getphno());			
		System.out.println("Result: " + p);	
		System.out.println("--------------------------------");
	}
	
	
}