package com.deloitte.emp.hibernate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorValue;


//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;



@Entity
@Inheritance
public class Employee {
	@Id
//	@GeneratedValue
	private int empId;

	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
  
	
  @Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
				
	}

  public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

  public Employee() {
	// TODO Auto-generated constructor stub
}
private String empName;
}
