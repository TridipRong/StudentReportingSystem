package com.salesken.test.modle;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.salesken.test.Enums.Semester;
import com.salesken.test.Enums.SubjectsType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer SubjectId;
	//private Integer StudentId;
	private Semester semester;
	private SubjectsType subtype;
	private double marks;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	List<Student> students = new ArrayList<>();

//	@Override
//	public String toString() {
//		return "Subjects [SubjectId=" + SubjectId + ", semester=" + semester + ", subtype=" + subtype + ", Marks="
//				+ Marks + ", students=" + students + "]";
//	}

	
}
