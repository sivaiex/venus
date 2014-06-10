package com.iexsoft.domain.secondaries;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.iexsoft.domain.Domain;

@Document(collection = "fee_paid_status")
public class FeePaidStatus extends Domain implements Serializable {

	private static final long serialVersionUID = 144983210496633821L;

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
