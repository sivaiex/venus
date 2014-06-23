package com.iexsoft.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "student_credit")
public class StudentCredit extends Domain {

	@Field("student_id")
	@JsonProperty(value = "student_id")
	private String student;

	@Field("credit_balance")
	@JsonProperty(value = "credit_balance")
	private float creditBalance;

	@Field("history")
	@JsonProperty(value = "history")
	CreditHistory[] history;

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public float getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(float creditBalance) {
		this.creditBalance = creditBalance;
	}

	public CreditHistory[] getHistory() {
		return history;
	}

	public void setHistory(CreditHistory[] history) {
		this.history = history;
	}

}
