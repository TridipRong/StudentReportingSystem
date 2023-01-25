package com.salesken.test.modle;

import java.util.ArrayList;
import java.util.List;

import com.salesken.test.Enums.Semester;
import com.salesken.test.Enums.SubjectsType;

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
public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer SubjectId;
	private Semester semester;
	private SubjectsType subtype;
	private int Marks;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	List<Student> students = new ArrayList<>();
//
//	@Override
//	public String toString() {
//		return "Subjects [SubjectId=" + SubjectId + ", semester=" + semester + ", subtype=" + subtype + ", Marks="
//				+ Marks + ", students=" + students + "]";
//	}

	
}
