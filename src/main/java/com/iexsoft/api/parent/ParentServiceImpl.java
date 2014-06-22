package com.iexsoft.api.parent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.iexsoft.domain.Parent;
import com.iexsoft.repositories.ParentRepository;
import com.iexsoft.service.DomainService;

@Controller
public class ParentServiceImpl implements ParentService {

	@Autowired
	DomainService domainService;

	
	public List<Parent> getParents() {
		return domainService.getRepository(ParentRepository.class).findAll();
	}

	
	public List<Parent> getParentsByLastName(String surname) {
		return domainService.getRepository(ParentRepository.class).findByLastName(surname);

	}

	
	public List<Parent> getParentsByFirstName(String firstname) {
		return domainService.getRepository(ParentRepository.class).findByFirstName(firstname);
	}

	
	public List<Parent> getParentsByPrimaryPhone(String primaryphone) {
		return domainService.getRepository(ParentRepository.class).findByPrimaryPhone(primaryphone);
	}

	
	public List<Parent> getParentsByMobilePhone(String mobilephone) {
		return domainService.getRepository(ParentRepository.class).findByMobilePhone(mobilephone);
	}

	
	public List<Parent> searchStudentsByFirstNameMatch(String firstname) {
		return domainService.searchParentsByFirstName(firstname);
	}

	
	public List<Parent> searchStudentsByLastNameMatch(String lastname) {
		return domainService.searchParentsByLastName(lastname);
	}

}
