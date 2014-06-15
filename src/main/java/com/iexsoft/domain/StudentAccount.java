package com.iexsoft.domain;

import java.io.Serializable;
import java.util.Date;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "student_account")
public class StudentAccount extends Domain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4093982725442212490L;

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

}
