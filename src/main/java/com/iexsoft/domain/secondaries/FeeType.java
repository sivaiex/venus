package com.iexsoft.domain.secondaries;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.iexsoft.domain.Domain;

@Document(collection = "fee_type")
public class FeeType extends Domain implements Serializable {

	private static final long serialVersionUID = 1776411948913404227L;

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
