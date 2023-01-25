package com.salesken.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesken.test.modle.Subjects;

@Repository
public interface SubjectRepo extends JpaRepository<Subjects, Integer> {

}
