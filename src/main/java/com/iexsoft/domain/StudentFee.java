package com.iexsoft.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "student_fee")
public class StudentFee extends Domain {

	@Field("student_id")
	@JsonProperty(value = "student_id")
	private String student;

	@Field("fee_id")
	@JsonProperty(value = "fee_id")
	private String[] fees;

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String[] getFees() {
		return fees;
	}

	public void setFees(String[] fees) {
		this.fees = fees;
	}


}
