package com.circlek.hr.repository;

import com.circlek.hr.entities.Hod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HodRepo extends JpaRepository<Hod,Integer> {
}
