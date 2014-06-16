package com.iexsoft.controller.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iexsoft.domain.Student;
import com.iexsoft.repositories.StudentRepository;
import com.iexsoft.service.DomainService;

@Controller
public class StudentController {

	@Autowired
	DomainService domainService;
	
	@RequestMapping(value="/students", method=RequestMethod.GET)
	public @ResponseBody Student getstudents(){
		List<Student> list = domainService.getRepository(StudentRepository.class).findAll();
		
		return list.get(0);
		
		
	}
}
