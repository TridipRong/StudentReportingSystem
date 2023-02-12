package com.salesken.test.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesken.test.Exceptions.StudentExceptions;
import com.salesken.test.Exceptions.SubjectExceptions;
import com.salesken.test.Repository.StudentRepo;
import com.salesken.test.Repository.SubjectRepo;
import com.salesken.test.modle.Student;
import com.salesken.test.modle.Subjects;
import com.salesken.test.modle.DTO.StudentDto;
import com.salesken.test.modle.DTO.StudentSubjectDto;

@Service
public class StudentServiceimpl implements StudentService {


	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private SubjectRepo subRepo;
	
	@Override
	public Student registerStudent(StudentDto studentDTO) throws StudentExceptions {
		Student student=new Student();
		student.setName(studentDTO.getName());
		student.setFatherName(studentDTO.getFatherName());
		student.setMobileNumber(studentDTO.getMobileNumber());
		student.setEmail(studentDTO.getEmail());
		student.setGender(studentDTO.getGender());;
		return studentRepo.save(student);
	}

	
	
	@Override
	public Student getStudentById(Integer studentId) throws StudentExceptions {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Student addSubjectToStudent(Integer studentId, StudentSubjectDto subject) throws SubjectExceptions, StudentExceptions {
		Optional<Student> opt = studentRepo.findById(studentId);
		//Optional<Subjects> opt2 = subRepo.findById(SubjectId);
		
		Subjects opt2=new Subjects();
		opt2.setMarks(subject.getMarks());
		opt2.setSemester(subject.getSemester());
		opt2.setSubtype(subject.getSubjectName());
		opt2.setSubjectId(opt2.getSubjectId());
		subRepo.save(opt2);
		if(opt.isPresent()) {
			
				Student student = opt.get();
				//Subjects sub = opt2.get();
			student.getSubject().add(opt2);
			
			return studentRepo.save(student);
			
			//else throw new SubjectExceptions("hotel not found");
		}
		else throw new StudentExceptions("no packages exists with packagesId:"+studentId);
	}

}
