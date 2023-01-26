package com.salesken.test.modle.DTO;


import com.salesken.test.Enums.Semester;
import com.salesken.test.Enums.SubjectsType;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StudentSubjectDto {
	@NotNull(message = "studentId cannot be Null")
	@NotBlank(message = "studentId cannot be blank")
	@NotEmpty(message = "studentId cannot be empty")
	private Integer studentId;
	
	@NotNull(message = "semester cannot be Null")
	@NotBlank(message = "semester cannot be blank")
	@NotEmpty(message = "semester cannot be empty")
	private Semester semester;
	
	@NotNull(message = "subjectName cannot be Null")
	@NotBlank(message = "subjectName cannot be blank")
	@NotEmpty(message = "subjectName cannot be empty")
	private SubjectsType subjectName;
	
	
	@NotNull(message = "Marks cannot be Null")
	@NotBlank(message = "Marks cannot be blank")
	@NotEmpty(message = "Marks cannot be empty")
	private int Marks;
	
}
