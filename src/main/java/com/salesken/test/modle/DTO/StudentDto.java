package com.salesken.test.modle.DTO;

import com.salesken.test.Enums.Gender;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
