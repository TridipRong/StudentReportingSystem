package com.salesken.test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salesken.test.modle.Student;
import com.salesken.test.modle.Subjects;

@Repository
public interface SubjectRepo extends JpaRepository<Subjects, Integer> {
	@Query(value="select stiusemester avg(marks) from student where semester=sem" ,nativeQuery=true) 
	public Integer getAverageOfRecentSemester(Integer sem) ;
	
	@Query(value=" select studentId, subject,avg(marks) from student where roll=rollno group by subject" ,nativeQuery=true) 
	public List<Subjects> averageMarksOfStudents(Integer rollno) ;
	
	@Query(value=" select student.name,avg(subject.marks) as avarege from subject left join student on Student.studentId=Subject.studentId group by name order by avarege desc limit 2" ,nativeQuery=true) 
	public List<Student> top2ConsistentStudents(Subjects subject,Student student) ;
	
	
}
