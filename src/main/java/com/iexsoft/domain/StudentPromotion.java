package com.iexsoft.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "student_promotion")
public class StudentPromotion extends Domain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4093982725442212490L;

	@NotNull
	@Field("student_id")
	private String student;
	@NotNull
	@Field("class_id")
	private String studyClass;
	@Field("acdmyr")
	private String academicYear;
	@Field("promoted")
	private boolean isPromoted;
	private String reason;
	private Date date;
	@Field("promoted_by")
	private String promotedBy;

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getStudyClass() {
		return studyClass;
	}

	public void setStudyClass(String studyClass) {
		this.studyClass = studyClass;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public boolean isPromoted() {
		return isPromoted;
	}

	public void setPromoted(boolean isPromoted) {
		this.isPromoted = isPromoted;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPromotedBy() {
		return promotedBy;
	}

	public void setPromotedBy(String promotedBy) {
		this.promotedBy = promotedBy;
	}

}
