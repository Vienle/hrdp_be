package com.circlek.hr.repository;

import com.circlek.hr.entities.Criteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriteriaRepo extends JpaRepository<Criteria,Integer> {
}
