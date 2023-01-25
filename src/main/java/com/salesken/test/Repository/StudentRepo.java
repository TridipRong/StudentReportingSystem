package com.salesken.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesken.test.modle.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
}
