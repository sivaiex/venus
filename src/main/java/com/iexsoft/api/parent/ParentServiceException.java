package com.iexsoft.api.parent;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class ParentServiceException extends WebApplicationException {
	/**
		 * 
		 */
	private static final long serialVersionUID = -5554067420277041419L;

	public ParentServiceException() {
		super();
	}

	public ParentServiceException(Response.Status status, String errorMsg) {

		super(Response.status(status).entity(errorMsg).build());
	}

}
