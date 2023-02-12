package com.salesken.test.modle;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.salesken.test.Enums.Gender;

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
	@Column(name = "studentId", unique = true, nullable = false)
	private Integer studentId;
	private String Name;
	
	private String fatherName;
	private String email;
	private String mobileNumber;
	private Gender gender;


	@OneToMany(cascade = CascadeType.ALL)
	private List<Subjects> subject = new ArrayList<>();

//
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", Name=" + Name + ", fatherName=" + fatherName + ", email=" + email
//				+ ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", subject=" + subject + "]";
//	}




}
