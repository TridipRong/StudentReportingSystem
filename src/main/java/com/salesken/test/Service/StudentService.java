package com.salesken.test.Service;

import com.salesken.test.Exceptions.StudentExceptions;
import com.salesken.test.Exceptions.SubjectExceptions;
import com.salesken.test.modle.Student;
import com.salesken.test.modle.DTO.StudentDto;
import com.salesken.test.modle.DTO.StudentSubjectDto;



public interface StudentService {
	
	public Student registerStudent( StudentDto student) throws StudentExceptions;
	public Student addSubjectToStudent(Integer studentId,StudentSubjectDto subject) throws SubjectExceptions,StudentExceptions;
	public Student getStudentById(Integer studentId) throws StudentExceptions ;
	
}
