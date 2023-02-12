package com.salesken.test.Controller;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesken.test.Exceptions.StudentExceptions;
import com.salesken.test.Exceptions.SubjectExceptions;
import com.salesken.test.Service.StudentService;
import com.salesken.test.Service.SubjectService;
import com.salesken.test.modle.Student;
import com.salesken.test.modle.Subjects;
import com.salesken.test.modle.DTO.StudentDto;
import com.salesken.test.modle.DTO.StudentSubjectDto;

import io.swagger.v3.oas.annotations.parameters.RequestBody;



@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	SubjectService subservice;
	
	@PostMapping("/student/register")
	public ResponseEntity<Student> registerStudentHandler(@Valid @RequestBody StudentDto Student	) throws StudentExceptions{
		
		Student registeredUser =  studentService.registerStudent(Student) ;
		
		return new ResponseEntity<Student>(registeredUser,HttpStatus.CREATED) ;
	}
	
//	@PostMapping("/subject/register")
//	public ResponseEntity<Subjects> registerSubjectHandler(@Valid @RequestBody StudentSubjectDto subject	) throws  SubjectExceptions{
//		
//		Subjects registeredsub =  subservice.registerSubject(subject) ;
//		
//		return new ResponseEntity<Subjects>(registeredsub,HttpStatus.CREATED) ;
//		
//	}
//	
	@PutMapping("/addSubjectToStudent/{studentId}")
	public ResponseEntity<Student> addSujectToStdent(@PathVariable("studentId") Integer studentId ,@RequestBody StudentSubjectDto SubjectId) throws StudentExceptions, SubjectExceptions{
	
		Student sub = studentService.addSubjectToStudent(studentId,SubjectId);
		return new ResponseEntity<Student>(sub,HttpStatus.OK);
	}
	
	
	@GetMapping("/getAverageOfRecentSemester")
	 public ResponseEntity<Double> getAverageOfRecentSemester() throws SubjectExceptions{
		 return new ResponseEntity<Double>(subservice.getAverageOfRecentSemester(),HttpStatus.OK);
	 }
	
	@GetMapping("/averageMarksOfStudents")
	 public ResponseEntity<List<Object[]>> getaverageMarksOfStudents() throws SubjectExceptions{
		return new ResponseEntity<List<Object[]>>(subservice.averageMarksOfStudents(),HttpStatus.OK);
	 }
	@GetMapping("/top2ConsistentStudents")
	 public ResponseEntity<List<Object[]>> gettop2ConsistentStudents() throws SubjectExceptions{
		return new ResponseEntity<List<Object[]>>(subservice.top2ConsistentStudents(),HttpStatus.OK);
	 }
	
}
