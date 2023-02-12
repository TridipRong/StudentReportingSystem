package com.salesken.test.modle.DTO;


import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.salesken.test.Enums.Semester;
import com.salesken.test.Enums.SubjectsType;

import lombok.Data;

@Data
public class StudentSubjectDto {
//	@NotNull(message = "studentId cannot be Null")
//	@NotBlank(message = "studentId cannot be blank")
//	@NotEmpty(message = "studentId cannot be empty")
	//private Integer SubjectId;
	
	@NotNull(message = "semester cannot be Null")
	
	private Semester semester;
	
	@NotNull(message = "subjectName cannot be Null")
	
	private SubjectsType subjectName;
	
	
	@NotNull(message = "Marks cannot be Null")
	@Max(value = 100, message = "From must be less tan 101")
	private double marks;
	
}
