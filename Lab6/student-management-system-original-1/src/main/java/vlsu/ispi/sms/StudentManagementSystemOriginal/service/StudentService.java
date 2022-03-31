package vlsu.ispi.sms.StudentManagementSystemOriginal.service;

import java.util.List;

import vlsu.ispi.sms.StudentManagementSystemOriginal.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);

}
