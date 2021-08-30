package com.circlek.hr.repository;

import com.circlek.hr.entities.CriteriaHRDP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriteriaHRDPRepo extends JpaRepository<CriteriaHRDP,Integer> {
}
