package com.salesken.test.modle;

import java.util.ArrayList;
import java.util.List;

import com.salesken.test.Enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	private String Name;
	
	private String fatherName;
	private String email;
	private String mobileNumber;
	private Gender gender;


//	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "students")
//	List<Subjects> subject = new ArrayList<>();

//
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", Name=" + Name + ", fatherName=" + fatherName + ", email=" + email
//				+ ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", subject=" + subject + "]";
//	}




}
