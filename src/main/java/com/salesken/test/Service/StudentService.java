package com.salesken.test.Service;

import com.salesken.test.Exceptions.StudentExceptions;
import com.salesken.test.modle.Student;
import com.salesken.test.modle.DTO.StudentDto;

public interface StudentService {
	
	public Student registerStudent(Student studentDTO) throws StudentExceptions;
	
	public Student getStudentById(Integer studentId) throws StudentExceptions ;
}
