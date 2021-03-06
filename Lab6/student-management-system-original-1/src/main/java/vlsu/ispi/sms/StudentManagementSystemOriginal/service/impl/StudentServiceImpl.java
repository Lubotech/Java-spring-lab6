package vlsu.ispi.sms.StudentManagementSystemOriginal.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import vlsu.ispi.sms.StudentManagementSystemOriginal.entity.Student;
import vlsu.ispi.sms.StudentManagementSystemOriginal.repository.StudentRepository;
import vlsu.ispi.sms.StudentManagementSystemOriginal.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
  @Override
  public Student saveStudent(Student student) {
	  return studentRepository.save(student);
  }
}
