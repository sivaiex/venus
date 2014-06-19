package com.iexsoft.controller.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

	/*
	 * Get all Students, probably we may not using this method because is going
	 * to return all students list in school
	 */
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public @ResponseBody
	Student[] getstudents() {
		List<Student> list = domainService.getRepository(
				StudentRepository.class).findAll();
		Student[] students = new Student[list.size()];
		return list.toArray(students);

	}
	
	/*
	 * Get Students by last name
	 */
	@RequestMapping(value = "/students/ln/{surname}", method = RequestMethod.GET)
	public @ResponseBody
	Student[] getstudentsByLastName(@PathVariable("surname")
	String surname) {
		List<Student> list = domainService.getRepository(
				StudentRepository.class).findByLastName(surname);
		Student[] students = new Student[list.size()];
		return list.toArray(students);
    }
	
	/*
	 * Get Students by last name
	 */
	@RequestMapping(value = "/students/fn/{firstname}", method = RequestMethod.GET)
	public @ResponseBody
	Student[] getstudentsByFirstName(@PathVariable("firstname")
	String firstname) {
		List<Student> list = domainService.getRepository(
				StudentRepository.class).findByFirstName(firstname);
		Student[] students = new Student[list.size()];
		return list.toArray(students);

	}
	
	
}
