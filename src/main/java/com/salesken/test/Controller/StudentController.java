package com.salesken.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesken.test.Exceptions.StudentExceptions;
import com.salesken.test.Service.StudentService;
import com.salesken.test.modle.Student;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student/register")
	public ResponseEntity<Student> registerStudentHandler(@Valid @RequestBody Student Student	) throws StudentExceptions{
		
		Student registeredUser =  studentService.registerStudent(Student) ;
		
		return new ResponseEntity<Student>(registeredUser,HttpStatus.CREATED) ;
	}
}
