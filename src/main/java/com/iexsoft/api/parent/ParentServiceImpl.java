package com.iexsoft.api.parent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iexsoft.domain.Parent;
import com.iexsoft.repositories.ParentRepository;
import com.iexsoft.service.DomainService;

@Controller
public class ParentServiceImpl implements ParentService {

	@Autowired
	DomainService domainService;

	/*
	 * Get all Students, probably we may not using this method because is going
	 * to return all students list in school
	 */
	@RequestMapping(value = "/parents", method = RequestMethod.GET)
	@ResponseBody
	public List<Parent> getParents() {
		return domainService.getRepository(ParentRepository.class).findAll();
	}

	/*
	 * Get Students by last name
	 */
	@RequestMapping(value = "/parents/ln/{lastname}", method = RequestMethod.GET)
	@ResponseBody
	public List<Parent> getParentsByLastName(@PathVariable("lastname") String surname) {
		return domainService.getRepository(ParentRepository.class).findByLastName(surname);

	}

	/*
	 * Get Parents by First name
	 */
	@RequestMapping(value = "/parents/fn/{firstname}", method = RequestMethod.GET)
	@ResponseBody
	public List<Parent> getParentsByFirstName(@PathVariable("firstname") String firstname) {
		return domainService.getRepository(ParentRepository.class).findByFirstName(firstname);
	}

	/*
	 * Get Parents by Primary Phone
	 */
	@RequestMapping(value = "/parents/primaryphone/{primaryphone}", method = RequestMethod.GET)
	@ResponseBody
	public List<Parent> getParentsByPrimaryPhone(@PathVariable("primaryphone") String primaryphone) {
		return domainService.getRepository(ParentRepository.class).findByPrimaryPhone(primaryphone);
	}

	/*
	 * Get Parents by Mobile Phone
	 */
	@RequestMapping(value = "/parents/mobilephone/{mobilephone}", method = RequestMethod.GET)
	@ResponseBody
	public List<Parent> getParentsByMobilePhone(@PathVariable("mobilephone") String mobilephone) {
		return domainService.getRepository(ParentRepository.class).findByMobilePhone(mobilephone);
	}

	/*
	 * Search Parents by first name match
	 */
	@RequestMapping(value = "/parents/fns/{firstname}", method = RequestMethod.GET)
	@ResponseBody
	public List<Parent> searchStudentsByFirstNameMatch(@PathVariable("firstname") String firstname) {
		return domainService.searchParentsByFirstName(firstname);
	}

	/*
	 * Search Parents by last name match
	 */
	@RequestMapping(value = "/parents/lns/{lastname}", method = RequestMethod.GET)
	@ResponseBody
	public List<Parent> searchStudentsByLastNameMatch(@PathVariable("lastname") String lastname) {
		return domainService.searchParentsByLastName(lastname);
	}

}
