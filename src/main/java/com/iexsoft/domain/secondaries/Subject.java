package com.iexsoft.domain.secondaries;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.iexsoft.domain.Domain;

@Document(collection = "subject")
public class Subject extends Domain implements Serializable {

	private static final long serialVersionUID = -3570975884591207351L;

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
