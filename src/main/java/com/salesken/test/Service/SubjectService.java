package com.salesken.test.Service;

import com.salesken.test.Exceptions.SubjectExceptions;
import com.salesken.test.modle.Subjects;
import com.salesken.test.modle.DTO.StudentSubjectDto;

public interface SubjectService {
	public Subjects addSubjectToStudent(StudentSubjectDto subject) throws SubjectExceptions;
}
