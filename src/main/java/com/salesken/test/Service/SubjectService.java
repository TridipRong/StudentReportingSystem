package com.salesken.test.Service;

import java.util.List;

import com.salesken.test.Exceptions.StudentExceptions;
import com.salesken.test.Exceptions.SubjectExceptions;
import com.salesken.test.modle.Student;
import com.salesken.test.modle.Subjects;
import com.salesken.test.modle.DTO.StudentSubjectDto;

public interface SubjectService {
	public Subjects addSubjectToStudent(StudentSubjectDto subject,Integer studentId) throws SubjectExceptions,StudentExceptions;
	public Integer getAverageOfRecentSemester(Integer sem);
	public List<Student> top2ConsistentStudents(Subjects subject,Student student)  throws SubjectExceptions,StudentExceptions;
	public List<Subjects> averageMarksOfStudents(Subjects subj,Integer rollno) ;
	
}
