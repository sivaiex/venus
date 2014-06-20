package com.iexsoft.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "student_account")
public class StudentAccountActivity extends Domain {

	@Field("student_id")
	private String student;
	@Field("fee_id")
	private String fee;
	@Field("due_date")
	private Date dueDate;
	private String status;
	@Field("paid_date")
	private Date paidDate;
	@Field("paid_method")
	private String paidMedthod;
	
	// Due from the current term
	private float currentDue;
	
	/**
	* Due from previous balances if any
	* previous due could be +ve or -ve, If student overpays in previously, 
	* that will be adjusted
	* 
	*/
	private float previousDue;
	private float discount;
	private float totalDue;
	private float paidAmount;
	private float balance;

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public String getPaidMedthod() {
		return paidMedthod;
	}

	public void setPaidMedthod(String paidMedthod) {
		this.paidMedthod = paidMedthod;
	}

	public float getCurrentDue() {
		return currentDue;
	}

	public void setCurrentDue(float currentDue) {
		this.currentDue = currentDue;
	}

	public float getPreviousDue() {
		return previousDue;
	}

	public void setPreviousDue(float previousDue) {
		this.previousDue = previousDue;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getTotalDue() {
		return totalDue;
	}

	public void setTotalDue(float totalDue) {
		this.totalDue = totalDue;
	}

	public float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	

}
