package com.salesken.test.modle.DTO;


import com.salesken.test.Enums.Semester;
import com.salesken.test.Enums.SubjectsType;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StudentSubjectDto {
	@NotNull(message = "name cannot be Null")
	@NotBlank(message = "name cannot be blank")
	@NotEmpty(message = "name cannot be empty")
	private Semester semester;
	
	@NotNull(message = "fatherName cannot be Null")
	@NotBlank(message = "fatherName cannot be blank")
	@NotEmpty(message = "fatherName cannot be empty")
	private SubjectsType subtype;
	
	
	@NotNull(message = "fatherName cannot be Null")
	@NotBlank(message = "fatherName cannot be blank")
	@NotEmpty(message = "fatherName cannot be empty")
	private int Marks;
	
}
