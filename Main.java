//********** Hierarchical Inharitance*************


//**** Super Class/Base Class/ Parent Class *****

class Employee
{
	protected String comp = "Maventic";
	private String add = "Bengalore" ;
	public int pin = 70001;
	
	protected void display1()
	{
		System.out.println("Company name: "+comp);
		System.out.println("Address: "+add);
		System.out.println("Pin no: "+pin);
	}
}




/*
Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

Here, Java_Developer is the subclass and Employee is the superclass. 
The relationship between the two classes is Java_Developer IS-A Employee. 
It means that Java_Developer is a type of Employee.


*/


//**** Sub Class/ Clild Class/ Derive Class*******

class Java_Developer extends Employee
{
	public String name = "Mrinmoy Day";
	public float salary =  50000.00f;
	
	public void display2()
	{
		System.out.println("===========================================================\n");
		super.display1();
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
	
	}
	
}

class Abap_Developer extends Employee
{
	public String name = "Debabrata Barui";
	public float salary =  22916.00f;
	
	public void display2()
	{
		System.out.println("===========================================================\n");
		super.display1();
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
	
	}
	
}

public class Main
{
	public static void main (String[] args)
	{
	  Java_Developer obj1 = new Java_Developer();
	  Abap_Developer obj2 = new Abap_Developer();
	  	  
	  obj1.display2();
	  obj2.display2();
	}
}