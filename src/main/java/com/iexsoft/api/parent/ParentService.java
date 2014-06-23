package com.iexsoft.api.parent;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.PathVariable;

import com.iexsoft.api.ServiceURL;
import com.iexsoft.domain.Parent;


public interface ParentService {

	/*
	 * Get all Students, probably we may not using this method because is going
	 * to return all students list in school
	 */
	@GET
	@Path(ServiceURL.All_PARENTS)
	public List<Parent> getParents() ;

	
	public List<Parent> getParentsByLastName(@PathVariable("lastname") String surname) ;

	
	public List<Parent> getParentsByFirstName(@PathVariable("firstname") String firstname) ;

	
	public List<Parent> getParentsByPrimaryPhone(@PathVariable("primaryphone") String primaryphone) ;

	
	public List<Parent> getParentsByMobilePhone(@PathVariable("mobilephone") String mobilephone) ;

	
	public List<Parent> searchStudentsByFirstNameMatch(@PathVariable("firstname") String firstname) ;

	
	public List<Parent> searchStudentsByLastNameMatch(@PathVariable("lastname") String lastname) ;

}
