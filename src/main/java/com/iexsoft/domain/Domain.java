package com.iexsoft.domain;

import org.springframework.data.annotation.Id;

public class Domain {

	/**
	 * 
	 */
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
