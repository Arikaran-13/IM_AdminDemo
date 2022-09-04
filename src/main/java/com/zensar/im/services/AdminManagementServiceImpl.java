package com.zensar.im.services;
import com.zensar.im.dto.Interview;
import com.zensar.im.entities.InterviewEntity;
import com.zensar.im.repos.InterviewScehduleRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.im.dto.Candidate;
import com.zensar.im.entities.CandidateEntity;
import com.zensar.im.exceptions.InvalidCandidateIdException;
import com.zensar.im.repos.CadidateRepo;
import java.util.*;


@Service
public class AdminManagementServiceImpl implements AdminManagementService{

	@Autowired
	CadidateRepo candidateRepository;
	@Autowired
	ModelMapper mapper;

	@Autowired
	InterviewScehduleRepo interviewSchedule;
	@Override
	public Candidate getCandidateById(int id) {
		Optional<CandidateEntity> opCandidateEntity = candidateRepository.findById(id);
		if(opCandidateEntity.isPresent()) {
			CandidateEntity candidateEntity= opCandidateEntity.get();
		
		//Candidate candidate = new Candidate(candidateEntity.getId(),candidateEntity.getName(),candidateEntity.getPrimarySkills(),candidateEntity.getSecondarySkills(),candidateEntity.getExp(),candidateEntity.getQualification(),candidateEntity.getDesg(),candidateEntity.getNoticePeriod(),candidateEntity.getLoc());
		
		Candidate candidatedto = mapper.map(candidateEntity,Candidate.class);
		return candidatedto;
		}
		throw new InvalidCandidateIdException("Candidate id not found: "+id);
	}

	@Override
	public Interview CreateInterviewSchedule(Interview interview) {
		InterviewEntity entity = mapper.map(interview, InterviewEntity.class);
	   InterviewEntity interviewEntity =	interviewSchedule.save(entity);
		return mapper.map(interviewEntity,Interview.class);
	}


}
	
	
      
 
	
	
	
			

