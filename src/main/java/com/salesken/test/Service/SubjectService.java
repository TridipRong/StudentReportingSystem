package com.salesken.test.Service;

import java.math.BigDecimal;
import java.util.List;

import com.salesken.test.Exceptions.StudentExceptions;
import com.salesken.test.Exceptions.SubjectExceptions;
import com.salesken.test.modle.Student;
import com.salesken.test.modle.Subjects;
import com.salesken.test.modle.DTO.StudentDto;
import com.salesken.test.modle.DTO.StudentSubjectDto;

public interface SubjectService {
	
	
	
	//public Subjects registerSubject( StudentSubjectDto subject) throws SubjectExceptions;
	
	public Double getAverageOfRecentSemester() throws SubjectExceptions;
	
	
	
	public List<Object[]> averageMarksOfStudents() throws SubjectExceptions;
	
	public List<Object[]> top2ConsistentStudents() throws SubjectExceptions;
	
	
}
