package com.circlek.hr.repository;

import com.circlek.hr.entities.EmployeeInfor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInforRepo extends JpaRepository<EmployeeInfor,Integer> {
}
