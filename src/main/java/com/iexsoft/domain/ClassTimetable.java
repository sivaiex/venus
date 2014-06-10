package com.iexsoft.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "class_timetable")
public class ClassTimetable extends Domain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4093982725442212490L;
	
	@NotNull
	@Field("class_id")
	private String studyClass;
	private String section;
	
	private Date date;
	private Timetable[] timetable;
	
	public String getStudyClass() {
		return studyClass;
	}
	public void setStudyClass(String studyClass) {
		this.studyClass = studyClass;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Timetable[] getTimetable() {
		return timetable;
	}
	public void setTimetable(Timetable[] timetable) {
		this.timetable = timetable;
	}
	
	
	
	
}