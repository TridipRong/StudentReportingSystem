package com.salesken.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
import jakarta.validation.Valid;

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
	@PostMapping("/addSubjectToStudent/{studentId}")
	public ResponseEntity<Subjects> addSujectToStdent(@RequestBody StudentSubjectDto Subject, @PathVariable("Subject") Integer studentId) throws StudentExceptions, SubjectExceptions{
	
		Subjects sub = subservice.addSubjectToStudent(Subject,studentId);
		return new ResponseEntity<Subjects>(sub,HttpStatus.OK);
	}
	@GetMapping("/getAverageOfRecentSemester{sem}")
	public ResponseEntity<Integer> getAverageOfRecentSemester(@RequestBody Subjects subject, @PathVariable("sem") Integer sem) throws StudentExceptions, SubjectExceptions{
		
		Integer sub = subservice.getAverageOfRecentSemester(sem);
		return new ResponseEntity<Integer>(sub,HttpStatus.OK);
	}
	@GetMapping("/top2ConsistentStudents")
	public ResponseEntity<List<Student>> top2ConsistentStudents(@RequestBody Subjects subject,@RequestBody Student student) throws StudentExceptions, SubjectExceptions{
		
		List<Student> sub = subservice.top2ConsistentStudents(subject,student);
		return new ResponseEntity<List<Student>>(sub,HttpStatus.OK);
	}
	@GetMapping("/averageMarksOfStudents/{rollno}")
	public ResponseEntity<List<Subjects>> averageMarksOfStudents(@RequestBody Subjects subject,@PathVariable("Rollno") Integer rollno) throws StudentExceptions, SubjectExceptions{
		
		List<Subjects> sub = subservice.averageMarksOfStudents(subject,rollno);
		return new ResponseEntity<List<Subjects>>(sub,HttpStatus.OK);
	}
	
}
