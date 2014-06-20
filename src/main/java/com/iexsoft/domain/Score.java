package com.iexsoft.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Field;

public class Score {
	/**
	 * 
	 */
	private String subject;
	@Field("markes_secured")
	private int marksObtained;
	@Field("total_marks")
	private int totalMarks;
	private String status;
	private String grade;
	@Field("test_date")
	private Date testDate;
	@Field("record_date")
	private Date recordDate;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

}
