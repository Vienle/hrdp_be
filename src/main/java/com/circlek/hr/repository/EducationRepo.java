package com.circlek.hr.repository;

import com.circlek.hr.entities.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepo extends JpaRepository<Education,Integer> {
}
