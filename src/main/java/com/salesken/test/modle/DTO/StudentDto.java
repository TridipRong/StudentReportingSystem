package com.salesken.test.modle.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.salesken.test.Enums.Gender;

import lombok.Data;

@Data
public class StudentDto {
	
	@NotNull(message = "name cannot be Null")
	@NotBlank(message = "name cannot be blank")
	@NotEmpty(message = "name cannot be empty")
	private String name;
	
	@NotNull(message = "fatherName cannot be Null")
	@NotBlank(message = "fatherName cannot be blank")
	@NotEmpty(message = "fatherName cannot be empty")
	private String fatherName;
	
	@Email(message = "Please enter valid emailId")
	private String email;
	
	@Pattern(regexp = "[6-9][0-9]{9}",message = "Mobile number should start with 6-9 and of size 10")
	private String mobileNumber;
	
	
	
	@NotNull(message = "gender cannot be Null")
	private Gender gender;
	
	
	
}
