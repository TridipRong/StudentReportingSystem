package com.salesken.test.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesken.test.Exceptions.SubjectExceptions;
import com.salesken.test.Repository.StudentRepo;
import com.salesken.test.Repository.SubjectRepo;
import com.salesken.test.modle.Subjects;
import com.salesken.test.modle.DTO.StudentSubjectDto;

@Service
public class SubjectServivceimpl implements SubjectService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private SubjectRepo subRepo;

//	@Override
//	public Subjects registerSubject(StudentSubjectDto subject) throws SubjectExceptions {
//		Subjects sub=new Subjects();
//		sub.setSemester(subject.getSemester());
//		sub.setMarks(subject.getMarks());
//		sub.setSubtype(subject.getSubjectName());
//		return subRepo.save(sub);
//	}

	@Override
	public Double getAverageOfRecentSemester() throws SubjectExceptions {
		List<Object[]> marksdetails=subRepo.getAverageOfRecentSemester();
		
		if(marksdetails==null) {
			throw new SubjectExceptions("Data not found");
		}
		 Object[] data=marksdetails.get(0);
		 Double Average =(Double) data[0];
		
		return Average;
	}

	@Override
	public List<Object[]> averageMarksOfStudents()throws SubjectExceptions {
		
		return subRepo.averageMarksOfStudents();
	}

	@Override
	public List<Object[]> top2ConsistentStudents()throws SubjectExceptions {
		return subRepo.top2ConsistentStudents();
	}
	
	

//	@Override
//	public List<Student> top2ConsistentStudents(Subjects subject,Student student) throws SubjectExceptions, StudentExceptions {
//		List<Student> student1 = subRepo.top2ConsistentStudents(subject,student);
// 		return student1;	
//	}
//
//	@Override
//	public Integer getAverageOfRecentSemester(Integer sem) {
//		Integer Average =subRepo.getAverageOfRecentSemester(sem);
//		
//		return Average;
//	}
//
//	@Override
//	public List<Subjects> averageMarksOfStudents(Subjects sub,Integer rollno) {
//	List<Subjects> sub1=subRepo.averageMarksOfStudents(rollno);
//		return sub1;
//	}

	
}
