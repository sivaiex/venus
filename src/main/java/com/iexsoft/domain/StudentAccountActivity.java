package com.iexsoft.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "student_account")
public class StudentAccountActivity extends Domain {

	@Field("student_id")
	@JsonProperty(value = "student_id")
	private String student;

	@Field("fee_id")
	@JsonProperty(value = "fee_id")
	private String fee;

	@Field("due_date")
	@JsonProperty(value = "due_date")
	private Date dueDate;

	private String status;

	@Field("paid_date")
	@JsonProperty(value = "paid_date")
	private Date paidDate;

	public float getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(float creditBalance) {
		this.creditBalance = creditBalance;
	}

	@Field("paid_method")
	@JsonProperty(value = "paid_method")
	private String paidMedthod;

	// Due from the current term
	@Field("current_due")
	@JsonProperty(value = "current_due")
	private float currentDue;

	/**
	 * credit balances if any previous due could be +ve or -ve, If student
	 * overpays in previously, that will be adjusted
	 * 
	 */
	@Field("credit_balance")
	@JsonProperty(value = "credit_balance")
	private float creditBalance;
	private float discount;

	@Field("total_due")
	@JsonProperty(value = "total_due")
	private float totalDue;

	@Field("paid_amount")
	@JsonProperty(value = "paid_amount")
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
