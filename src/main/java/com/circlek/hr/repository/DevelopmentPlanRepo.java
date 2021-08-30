package com.circlek.hr.repository;

import com.circlek.hr.entities.DevelopmentPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevelopmentPlanRepo extends JpaRepository<DevelopmentPlan,Integer> {
}
