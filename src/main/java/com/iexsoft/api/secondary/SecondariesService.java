package com.iexsoft.api.secondary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iexsoft.domain.secondaries.ClassType;
import com.iexsoft.domain.secondaries.FeeConcession;
import com.iexsoft.domain.secondaries.FeePaidStatus;
import com.iexsoft.domain.secondaries.FeeType;
import com.iexsoft.domain.secondaries.Role;
import com.iexsoft.domain.secondaries.StaffType;
import com.iexsoft.domain.secondaries.StudentAttendanceStatus;
import com.iexsoft.domain.secondaries.Subject;
import com.iexsoft.domain.secondaries.TestType;
import com.iexsoft.repositories.ClassTypeRepository;
import com.iexsoft.repositories.FeeConcessionRepository;
import com.iexsoft.repositories.FeePaidStatusRepository;
import com.iexsoft.repositories.FeeTypeRepository;
import com.iexsoft.repositories.RoleRepository;
import com.iexsoft.repositories.StaffTypeRepository;
import com.iexsoft.repositories.StudentAttendanceStatusRepository;
import com.iexsoft.repositories.SubjectRepository;
import com.iexsoft.repositories.TestTypeRepository;
import com.iexsoft.service.DomainService;


public class SecondariesService {

	@Autowired
	DomainService domainService;

	/*
	 * Get all class types
	 */
	@RequestMapping(value = "/classtypes", method = RequestMethod.GET)
	@ResponseBody
	public List<ClassType> getClassTypes() {
		return domainService.getRepository(ClassTypeRepository.class).findAll();
	}

	/*
	 * Get all Fee Concessions
	 */
	@RequestMapping(value = "/feeconcessions", method = RequestMethod.GET)
	@ResponseBody
	public List<FeeConcession> getFeeconcessions() {
		return domainService.getRepository(FeeConcessionRepository.class).findAll();
	}

	/*
	 * Get all Fee Paid statuses
	 */
	@RequestMapping(value = "/feepaidstatuses", method = RequestMethod.GET)
	@ResponseBody
	public List<FeePaidStatus> getFeepaidstatuses() {
		return domainService.getRepository(FeePaidStatusRepository.class).findAll();
	}

	/*
	 * Get all Fee types
	 */
	@RequestMapping(value = "/feetypes", method = RequestMethod.GET)
	@ResponseBody
	public List<FeeType> getFeetypes() {
		return domainService.getRepository(FeeTypeRepository.class).findAll();
	}

	/*
	 * Get all Roles
	 */
	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	@ResponseBody
	public List<Role> getRoles() {
		return domainService.getRepository(RoleRepository.class).findAll();
	}

	/*
	 * Get all Staff Types
	 */
	@RequestMapping(value = "/stafftypes", method = RequestMethod.GET)
	@ResponseBody
	public List<StaffType> getStaffTypes() {
		return domainService.getRepository(StaffTypeRepository.class).findAll();
	}

	/*
	 * Get all Student Attendance Types
	 */
	@RequestMapping(value = "/attendancestatsuses", method = RequestMethod.GET)
	@ResponseBody
	public List<StudentAttendanceStatus> getStudentAttendanceTypes() {
		return domainService.getRepository(StudentAttendanceStatusRepository.class).findAll();
	}

	/*
	 * Get all Subjects
	 */
	@RequestMapping(value = "/subjects", method = RequestMethod.GET)
	@ResponseBody
	public List<Subject> getSubjects() {
		return domainService.getRepository(SubjectRepository.class).findAll();
	}

	/*
	 * Get all Test Types
	 */
	@RequestMapping(value = "/testtypes", method = RequestMethod.GET)
	@ResponseBody
	public List<TestType> getTestTypes() {
		return domainService.getRepository(TestTypeRepository.class).findAll();
	}
}
