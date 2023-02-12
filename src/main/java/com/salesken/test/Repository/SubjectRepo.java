package com.salesken.test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salesken.test.modle.Student;
import com.salesken.test.modle.Subjects;

@Repository
public interface SubjectRepo extends JpaRepository<Subjects, Integer> {
	@Query(value="select avg(marks) as Average from subjects group by semester order by semester desc limit 1" ,nativeQuery=true) 
	public List<Object[]> getAverageOfRecentSemester() ;
	
	@Query(value="SELECT student.name as name, AVG(marks) as avg_marks,case subtype when 0 then 'English' when 1 then 'Maths' when 2 then 'science' else 'unknown' end as subname from subjects left join student_subject on subject_subject_id = subjects.subject_id LEFT JOIN student ON student_subject.student_student_id = student.student_id group by name,subtype" ,nativeQuery=true) 
	public List<Object[]> averageMarksOfStudents() ;
	
	
	@Query(value="SELECT student.name, AVG(marks) as avg_marks from subjects left join student_subject on subject_subject_id = subjects.subject_id LEFT JOIN student ON student_subject.student_student_id = student.student_id group by student.name order by avg_marks desc limit 2;" ,nativeQuery=true) 
	public List<Object[]> top2ConsistentStudents() ;

	
}
