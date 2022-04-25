package com.srivani.oops;

import java.util.ArrayList;

//implementing java interface concept and abstraction
public interface EmployeeMangementSystem {
  
	public ArrayList<Employee> empData();
	public String findEmp(int id);
	public String remEmp(int id);
	public void addEmp(Employee emp);
}
