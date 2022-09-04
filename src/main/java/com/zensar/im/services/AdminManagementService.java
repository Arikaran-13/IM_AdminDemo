package com.zensar.im.services;



import com.zensar.im.dto.Candidate;
import com.zensar.im.dto.Interview;


public interface AdminManagementService {
	public  Candidate  getCandidateById(int id);
	public Interview CreateInterviewSchedule(Interview interview);

	


}
