package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="empId", unique=true)
	private Long empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empEmail", unique=true)
	private String empEmail;
	
	@Column(name="empDob")
	private String empDob;
	
	@Column(name="empContact", unique=true)
	private String empContact;
	
	@Column(name="empEmercontact")
	private String empEmercontact;
	
	@Column(name="empBloodgroup")
	private String empBloodgroup;
	
	@Column(name="empAddress")
	private String empAddress;
	
	@Column(name="empJoinDate")
	private String empJoinDate;
	
	
	public Employee()
	{
		
	}

	public Employee(Long empId, String empName, String empEmail, String empDob, String empContact,
			String empEmercontact, String empBloodgroup, String empAddress, String empJoinDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empDob = empDob;
		this.empContact = empContact;
		this.empEmercontact = empEmercontact;
		this.empBloodgroup = empBloodgroup;
		this.empAddress = empAddress;
		this.empJoinDate = empJoinDate;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpDob() {
		return empDob;
	}

	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public String getEmpEmercontact() {
		return empEmercontact;
	}

	public void setEmpEmercontact(String empEmercontact) {
		this.empEmercontact = empEmercontact;
	}

	public String getEmpBloodgroup() {
		return empBloodgroup;
	}

	public void setEmpBloodgroup(String empBloodgroup) {
		this.empBloodgroup = empBloodgroup;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpJoinDate() {
		return empJoinDate;
	}

	public void setEmpJoinDate(String empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
}
