package com.iexsoft.domain;

import org.springframework.data.mongodb.core.mapping.Field;

public class Timetable {
	/**
	 * 
	 */
	private String period;
	private String subject;
	@Field("staff_id")
	private String teacher;

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}
