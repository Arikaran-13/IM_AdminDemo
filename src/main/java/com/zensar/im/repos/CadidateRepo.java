package com.zensar.im.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.im.entities.CandidateEntity;

@Repository
public interface CadidateRepo extends JpaRepository<CandidateEntity, Integer>{

	
}
