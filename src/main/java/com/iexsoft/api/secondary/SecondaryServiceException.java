package com.iexsoft.api.student;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class SecondaryServiceException extends WebApplicationException {
	/**
		 * 
		 */
	private static final long serialVersionUID = -5554067420277041419L;

	public SecondaryServiceException() {
		super();
	}

	public SecondaryServiceException(Response.Status status, String errorMsg) {

		super(Response.status(status).entity(errorMsg).build());
	}

}
