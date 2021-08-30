package com.circlek.hr.repository;

import com.circlek.hr.entities.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepo extends JpaRepository<Credential,Integer> {
}
