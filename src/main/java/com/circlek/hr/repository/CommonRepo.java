package com.circlek.hr.repository;

import com.circlek.hr.entities.Common;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonRepo extends JpaRepository<Common,Integer> {
}
