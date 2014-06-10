package com.iexsoft.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "student_activity")
public class StudentActivity extends Domain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4093982725442212490L;

	@NotNull
	@Field("student_id")
	private String student;

	private String text;

	private Date date;

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
