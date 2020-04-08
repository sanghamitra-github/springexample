package com.javatpoint.dao;  
import java.util.ArrayList;
import java.util.List;

import com.javatpoint.beans.Emp;  
  
public class EmpDao {  
	
	/*
	 * private int id; 
	 * private String name; 
	 * private float salary; 
	 * private String
	 * designation;
	 */
	
  
public List<Emp> getEmployees(){  
	Emp employee1 = new Emp();
	Emp employee2 = new Emp();
	
	employee1.setId(1);
	employee1.setName("John");
	employee1.setDesignation("architect");
	employee1.setSalary(100000);
	
	employee2.setId(2);
	employee2.setName("Harry");
	employee2.setDesignation("engineer");
	employee2.setSalary(90000);
	
	List<Emp> empList = new ArrayList<Emp>();
	empList.add(employee1);
	empList.add(employee2);
	
    return empList;
}  

}  