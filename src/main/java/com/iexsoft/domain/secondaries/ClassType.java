package com.iexsoft.domain.secondaries;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.iexsoft.domain.Domain;

@Document(collection = "class_type")
public class ClassType extends Domain implements Serializable {

	private static final long serialVersionUID = -854097649784332090L;
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
