package com.srivani.oops;
//implementing java class and object concept
public class Employee{

	int empId;
	String name;
	float salary;
	long contact_no;
	String email_id;
	
	public Employee(int empId, String name, float salary, long contact_no, String email_id)
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.contact_no = contact_no;
		this.email_id = email_id;
	}
	
	public String toString()
	{
		return " Employee Details :" + "\nID: " + this.empId + "\nName: " + this.name + "\nSalary: " + 
				this.salary + "\nContact No: " + this.contact_no + "\nEmail-id: " + this.email_id;
	}
	
}