package com.iexsoft.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "class")
public class StudyClass extends Domain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4093982725442212490L;

	@NotNull
	private String name;
	@NotNull
	@Field("class_type")
	private String classType;

	private Section[] sections;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public Section[] getSections() {
		return sections;
	}

	public void setSections(Section[] sections) {
		this.sections = sections;
	}

}
