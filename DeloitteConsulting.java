package com.deloitte.emp.hibernate;
import javax.persistence.Entity;


@Entity
public class DeloitteConsulting extends Employee {
	
	private String TestTech;
	private String TestProfile;
	public DeloitteConsulting(String testTech, String testProfile) {
		super();
		TestTech = testTech;
		TestProfile = testProfile;
	}
	
	public DeloitteConsulting() {
		// TODO Auto-generated constructor stub
	}

	

	public String getTestTech() {
		return TestTech;
	}
	
	public void setTestTech(String testTech) {
		TestTech = testTech;
	}
	
	public String getTestProfile() {
		return TestProfile;
	}
	
	public void setTestProfile(String testProfile) {
		TestProfile = testProfile;
	}
	@Override
	
	public String toString() {
		return "DeloitteConsulting [TestTech=" + TestTech + ", TestProfile=" + TestProfile + ", getTestTech()="
				+ getTestTech() + ", getTestProfile()=" + getTestProfile() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setEmpId(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setEmpName(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
