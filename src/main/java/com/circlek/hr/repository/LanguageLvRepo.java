package com.circlek.hr.repository;

import com.circlek.hr.entities.LanguageLV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageLvRepo extends JpaRepository<LanguageLV,Integer> {
}
