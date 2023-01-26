package com.salesken.test.Service;

import java.util.List;
import java.util.Optional;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesken.test.Exceptions.StudentExceptions;
import com.salesken.test.Exceptions.SubjectExceptions;
import com.salesken.test.Repository.StudentRepo;
import com.salesken.test.Repository.SubjectRepo;
import com.salesken.test.modle.Student;
import com.salesken.test.modle.Subjects;
import com.salesken.test.modle.DTO.StudentSubjectDto;

@Service
public class SubjectServivceimpl implements SubjectService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private SubjectRepo subRepo;
	
	@Override
	public Subjects addSubjectToStudent(StudentSubjectDto subject,Integer studentId) throws SubjectExceptions,StudentExceptions {
		Subjects sub=new Subjects();
		sub.setStudentId(subject.getStudentId());
		sub.setSemester(subject.getSemester());
		sub.setMarks(subject.getMarks());
		sub.setSubtype(subject.getSubjectName());
		Optional<Student> opt = studentRepo.findById(studentId);
		if(opt.isPresent()) {
			Student student = opt.get();
			student.getSubject().add(sub);
			return subRepo.save(sub);
			}
			else throw new StudentExceptions("student not found");
	}

	@Override
	public List<Student> top2ConsistentStudents(Subjects subject,Student student) throws SubjectExceptions, StudentExceptions {
		List<Student> student1 = subRepo.top2ConsistentStudents(subject,student);
 		return student1;	
	}

	@Override
	public Integer getAverageOfRecentSemester(Integer sem) {
		Integer Average =subRepo.getAverageOfRecentSemester(sem);
		
		return Average;
	}

	@Override
	public List<Subjects> averageMarksOfStudents(Subjects sub,Integer rollno) {
	List<Subjects> sub1=subRepo.averageMarksOfStudents(rollno);
		return sub1;
	}

	
}
