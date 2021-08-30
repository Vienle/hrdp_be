package com.circlek.hr.repository;

import com.circlek.hr.entities.HRDP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HRDPRepo extends JpaRepository<HRDP,Integer> {
}
