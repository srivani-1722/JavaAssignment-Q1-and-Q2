package com.srivani.oops;

import java.util.ArrayList;
import java.util.List;

public class Main extends Management implements EmployeeMangementSystem  {
	public static ArrayList<Employee> db;
	static {
		db=new ArrayList<Employee>();
		db.add(new Employee(1,"emp1",10000,43949252,"email1@gmail.com"));
		db.add(new Employee(2,"emp2",40000,11949252,"email2@yahho.com"));
		db.add(new Employee(3,"emp3",10500,98949252,"email1@gmail.com"));
		db.add(new Employee(4,"emp4",14200,783949252,"email1@facebook.com"));
		db.add(new Employee(5,"emp5",70000,439553252,"email1@gmail.com"));

	}
	@Override
	public ArrayList<Employee> empData() {
		return db;
	}

	@Override
	public String findEmp(int id) {
		for(int i=0;i<db.size();i++) {
			if(db.get(i).empId==id) {
				return db.get(i).toString();
			}
		}
		return "Employee does not exist";
	}

	public void addEmp(Employee emp) {
		db.add(new Employee(10,"newEmp",90000,879799898,"new@gmail.com"));
	}

	@Override
	public String remEmp(int id) {
		// TODO Auto-generated method stub
		if(findEmp(id).equals("Employee does not exist")) {
			return "employee does not exist to remove";
		}
		else {
			db.remove(id);
			return "Employee removed successfully";
		}
	}
	public static void main(String[] args) throws EmployeeException {
		EmployeeMangementSystem em=new Main();
		List<Employee> list=em.empData();
		for(int i=0;i<list.size();i++) {
			System.out.println("employee "+(i+1)+" "+list.get(i).toString());
		}
		try {
		throw new EmployeeException("employee Exception");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(em.remEmp(2));
		List<Employee> list1=em.empData();
		for(int i=0;i<list1.size();i++) {
			System.out.println("employee "+(i+1)+" "+list1.get(i).toString());
		}
		System.out.println(em.findEmp(6));
	}

}
