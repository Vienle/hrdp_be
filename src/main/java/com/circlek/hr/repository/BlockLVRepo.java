package com.circlek.hr.repository;

import com.circlek.hr.entities.BlockLV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockLVRepo  extends JpaRepository<BlockLV,Integer> {
}
