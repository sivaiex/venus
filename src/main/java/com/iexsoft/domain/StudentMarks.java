package com.iexsoft.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "student_marks")
public class StudentMarks extends Domain implements Serializable {
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
	@Field("test_type")
	private String test;
	private Score[] score;

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

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public Score[] getScore() {
		return score;
	}

	public void setScore(Score[] score) {
		this.score = score;
	}

}
