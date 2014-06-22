package com.iexsoft.api.school;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.iexsoft.api.ServiceURL;
import com.iexsoft.domain.School;

public interface SchoolService {

	@GET
	@Path(ServiceURL.STUDENT_SERVICE_All_STUDENTS)
	public List<School> getschools();
}
