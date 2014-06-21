package com.iexsoft.api.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iexsoft.domain.School;
import com.iexsoft.repositories.SchoolRepository;
import com.iexsoft.service.DomainService;


public class SchoolService {

	@Autowired
	DomainService domainService;

	/*
	 * Get all Schools, probably we may not using this method because is going
	 * to return all students list in school
	 */
	@RequestMapping(value = "/schools", method = RequestMethod.GET)
	@ResponseBody
	public List<School> getschools() {
		return domainService.getRepository(SchoolRepository.class).findAll();
	}
}
