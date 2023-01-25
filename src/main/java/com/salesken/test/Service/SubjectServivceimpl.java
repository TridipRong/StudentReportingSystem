package com.salesken.test.Service;

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
	
	@Override
	public Subjects addSubjectToStudent(StudentSubjectDto subject) throws SubjectExceptions {
		Subjects sub=new Subjects();
		sub.setSemester(sub.getSemester());
		sub.setMarks(subject.getMarks());
		sub.setSubtype(subject.getSubtype());
		return subRepo.save(sub);
	}

}
