package com.iexsoft.api.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iexsoft.domain.School;
import com.iexsoft.repositories.SchoolRepository;
import com.iexsoft.service.DomainService;


public class SchoolServiceImpl implements SchoolService {

	@Autowired
	DomainService domainService;

	@Override
	public List<School> getschools() {
		return domainService.getRepository(SchoolRepository.class).findAll();
	}
}
