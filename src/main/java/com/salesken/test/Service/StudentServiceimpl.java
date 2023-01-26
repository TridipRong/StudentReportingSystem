package com.salesken.test.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesken.test.Exceptions.StudentExceptions;
import com.salesken.test.Repository.StudentRepo;
import com.salesken.test.Repository.SubjectRepo;
import com.salesken.test.modle.Student;
import com.salesken.test.modle.DTO.StudentDto;

@Service
public class StudentServiceimpl implements StudentService {


	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private SubjectRepo subRepo;
	
	@Override
	public Student registerStudent(StudentDto studentDTO) throws StudentExceptions {
		Student student=new Student();
		student.setName(studentDTO.getName());
		student.setFatherName(studentDTO.getFatherName());
		student.setMobileNumber(studentDTO.getMobileNumber());
		student.setEmail(studentDTO.getEmail());
		student.setGender(studentDTO.getGender());;
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Integer studentId) throws StudentExceptions {
		// TODO Auto-generated method stub
		return null;
	}

}
