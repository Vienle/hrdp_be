package com.circlek.hr.repository;

import com.circlek.hr.entities.ExpPiCK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpPiCKRepo extends JpaRepository<ExpPiCK,Integer> {
}
