package com.iexsoft.domain.secondaries;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.iexsoft.domain.Domain;

@Document(collection = "student_attendance_status")
public class StudentAttendanceStatus extends Domain implements Serializable {

	private static final long serialVersionUID = 2290245976289974771L;

	private String name;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
