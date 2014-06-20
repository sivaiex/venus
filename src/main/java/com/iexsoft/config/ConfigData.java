package com.iexsoft.config;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iexsoft.domain.secondaries.ClassType;
import com.iexsoft.domain.secondaries.FeePaidStatus;
import com.iexsoft.domain.secondaries.FeeType;
import com.iexsoft.domain.secondaries.PhotoType;
import com.iexsoft.domain.secondaries.Role;
import com.iexsoft.domain.secondaries.StaffType;
import com.iexsoft.domain.secondaries.StudentAttendanceStatus;
import com.iexsoft.domain.secondaries.Subject;
import com.iexsoft.domain.secondaries.TestType;

public class ConfigData {

	public static List<Role> getAllDefaultRoles() {

		List<Role> roles = new ArrayList<Role>();
		try {
			InputStream rolesStream = ConfigData.class.getResourceAsStream("roles.csv");
			Scanner scanner = new Scanner(rolesStream);

			while (scanner.hasNext()) {
				String curLine = scanner.nextLine();
				String[] rolesData = curLine.split(";");
				Role role = new Role();
				role.setName(rolesData[0]);
				role.setDescription(rolesData[1]);
				roles.add(role);
			}

			try {
				scanner.close();
			} catch (Exception e) {
			}
		} catch (Exception e) {

		}

		return roles;

	}

	public static List<StaffType> getAllDefaultStaffTypes() {

		List<StaffType> stafftypes = new ArrayList<StaffType>();
		try {
			InputStream staffTypesStream = ConfigData.class.getResourceAsStream("staff_types.csv");
			Scanner scanner = new Scanner(staffTypesStream);
			while (scanner.hasNext()) {
				String curLine = scanner.nextLine();
				String[] staffTypesData = curLine.split(";");
				StaffType staffType = new StaffType();
				staffType.setName(staffTypesData[0]);
				staffType.setDescription(staffTypesData[1]);
				stafftypes.add(staffType);
			}
			try {
				scanner.close();
			} catch (Exception e) {
			}
		} catch (Exception e) {

		}
		return stafftypes;

	}

	public static List<ClassType> getAllDefaultClassTypes() {

		List<ClassType> classtypes = new ArrayList<ClassType>();
		try {
			InputStream classTypesStream = ConfigData.class.getResourceAsStream("class_types.csv");
			Scanner scanner = new Scanner(classTypesStream);

			while (scanner.hasNext()) {
				String curLine = scanner.nextLine();
				String[] classTypesData = curLine.split(";");
				ClassType classType = new ClassType();
				classType.setName(classTypesData[0]);
				classType.setDescription(classTypesData[1]);
				classtypes.add(classType);
			}

			try {
				scanner.close();
			} catch (Exception e) {
			}
		} catch (Exception e) {

		}

		return classtypes;

	}

	public static List<FeeType> getAllDefaultFeeTypes() {

		List<FeeType> feetypes = new ArrayList<FeeType>();
		try {
			InputStream feeTypesStream = ConfigData.class.getResourceAsStream("fee_types.csv");
			Scanner scanner = new Scanner(feeTypesStream);

			while (scanner.hasNext()) {
				String curLine = scanner.nextLine();
				String[] feeTypesData = curLine.split(";");
				FeeType feeType = new FeeType();
				feeType.setName(feeTypesData[0]);
				feeType.setDescription(feeTypesData[1]);
				feetypes.add(feeType);
			}

			try {
				scanner.close();
			} catch (Exception e) {
			}
		} catch (Exception e) {

		}

		return feetypes;

	}

	public static List<TestType> getAllDefaultTestTypes() {

		List<TestType> testtypes = new ArrayList<TestType>();
		try {
			try {
				InputStream testTypesStream = ConfigData.class.getResourceAsStream("test_types.csv");
				Scanner scanner = new Scanner(testTypesStream);

				while (scanner.hasNext()) {
					String curLine = scanner.nextLine();
					String[] testTypesData = curLine.split(";");
					TestType testType = new TestType();
					testType.setName(testTypesData[0]);
					testType.setDescription(testTypesData[1]);
					testtypes.add(testType);
				}

				try {
					scanner.close();
				} catch (Exception e) {
				}

			} catch (Exception e) {
			}
		} catch (Exception e) {

		}

		return testtypes;

	}

	public static List<FeePaidStatus> getAllDefaultFeePaidStatus() {

		List<FeePaidStatus> feepaidStatuses = new ArrayList<FeePaidStatus>();
		try {
			InputStream feePaidStatusStream = ConfigData.class.getResourceAsStream("fee_paid_status.csv");
			Scanner scanner = new Scanner(feePaidStatusStream);

			while (scanner.hasNext()) {
				String curLine = scanner.nextLine();
				String[] feePaidStatusData = curLine.split(";");
				FeePaidStatus feePaidStatus = new FeePaidStatus();
				feePaidStatus.setName(feePaidStatusData[0]);
				feePaidStatus.setDescription(feePaidStatusData[1]);
				feepaidStatuses.add(feePaidStatus);
			}

			try {
				scanner.close();
			} catch (Exception e) {
			}
		} catch (Exception e) {
		}

		return feepaidStatuses;

	}

	public static List<StudentAttendanceStatus> getAllDefaultStudentAttendanceStatus() {

		List<StudentAttendanceStatus> studentAttendanceStatuses = new ArrayList<StudentAttendanceStatus>();
		try {
			InputStream studentAttendanceStatusesStream = ConfigData.class.getResourceAsStream("student_attendance_status.csv");
			Scanner scanner = new Scanner(studentAttendanceStatusesStream);

			while (scanner.hasNext()) {
				String curLine = scanner.nextLine();
				String[] studentAttData = curLine.split(";");
				StudentAttendanceStatus studentAttendanceStatus = new StudentAttendanceStatus();
				studentAttendanceStatus.setName(studentAttData[0]);
				studentAttendanceStatus.setDescription(studentAttData[1]);
				studentAttendanceStatuses.add(studentAttendanceStatus);
			}

			try {
				scanner.close();
			} catch (Exception e) {
			}
		} catch (Exception e) {
		}

		return studentAttendanceStatuses;

	}

	public static List<Subject> getAllDefaultSubjects() {

		List<Subject> subjects = new ArrayList<Subject>();
		try {
			InputStream subjectsStream = ConfigData.class.getResourceAsStream("subjects.csv");
			Scanner scanner = new Scanner(subjectsStream);

			while (scanner.hasNext()) {
				String curLine = scanner.nextLine();
				String[] subjectsData = curLine.split(";");
				Subject subject = new Subject();
				subject.setName(subjectsData[0]);
				subject.setDescription(subjectsData[1]);
				subjects.add(subject);
			}

			try {
				scanner.close();
			} catch (Exception e) {
			}
		} catch (Exception e) {
		}

		return subjects;

	}

	public static List<PhotoType> getAllDefaultPhotoTypes() {

		List<PhotoType> photoTypes = new ArrayList<PhotoType>();
		try {
			InputStream subjectsStream = ConfigData.class.getResourceAsStream("phototypes.csv");
			Scanner scanner = new Scanner(subjectsStream);

			while (scanner.hasNext()) {
				String curLine = scanner.nextLine();
				String[] photoTypeData = curLine.split(";");
				PhotoType photoType = new PhotoType();
				photoType.setType(photoTypeData[0]);
				photoType.setDescription(photoTypeData[1]);
				photoTypes.add(photoType);
			}

			try {
				scanner.close();
			} catch (Exception e) {
			}
		} catch (Exception e) {
		}

		return photoTypes;

	}

	/*
	 * public static List<FeeConcession> getAllDefaultFeeConcession() {
	 * 
	 * List<FeeConcession> feeConcessions = new ArrayList<FeeConcession>();
	 * InputStream feeConcessionStream = ConfigData.class
	 * .getResourceAsStream("fee-concession.csv"); Scanner scanner = new
	 * Scanner(feeConcessionStream);
	 * 
	 * while (scanner.hasNext()) { String curLine = scanner.nextLine(); String[]
	 * feePaidStatusData = curLine.split(";"); FeeConcession feeConcession = new
	 * FeeConcession(); feeConcession.setName(feePaidStatusData[0]);
	 * feeConcession.setDescription(feePaidStatusData[1]);
	 * feepaidStatuses.add(feeConcession); }
	 * 
	 * try { scanner.close(); } catch (Exception e) { }
	 * 
	 * return feepaidStatuses;
	 * 
	 * }
	 */

}
