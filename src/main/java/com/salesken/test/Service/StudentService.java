package com.salesken.test.Service;

import com.salesken.test.Exceptions.StudentExceptions;
import com.salesken.test.modle.Student;
import com.salesken.test.modle.DTO.StudentDto;

import jakarta.validation.Valid;

public interface StudentService {
	
	public Student registerStudent(@Valid StudentDto student) throws StudentExceptions;
	
	public Student getStudentById(Integer studentId) throws StudentExceptions ;
}
