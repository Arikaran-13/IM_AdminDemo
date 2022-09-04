package com.zensar.im.controller;

  

import com.zensar.im.dto.Interview;
import com.zensar.im.entities.InterviewEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.zensar.im.dto.Candidate;
import com.zensar.im.exceptions.InvalidCandidateIdException;
import com.zensar.im.services.AdminManagementService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController   
@CrossOrigin(origins = "*")
@RequestMapping(value="/interview-management")
public class AdminManagementController {
	
	@Autowired
	AdminManagementService adminManagementService;
	
	@GetMapping(value="/candidate/{id}" , produces = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value="fetching candidate by id",notes="This restendpoint return the candidate according the id")
	public ResponseEntity<Candidate> getCandidateById(@ApiParam(required=true)@PathVariable("id")int id) {
		Candidate candidate = adminManagementService.getCandidateById(id);
		if(candidate != null) {
		return new ResponseEntity<Candidate>(candidate,HttpStatus.OK);
		}
		
		 throw new InvalidCandidateIdException(""+id);
		 
	}
@PostMapping(value = "/interview", produces = {MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE},
consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
@ApiOperation(value="Creates a interview Schedule")
	public ResponseEntity<Interview> createInterviewSchedule(@RequestBody Interview ie){
return new ResponseEntity<>(adminManagementService.CreateInterviewSchedule(ie),HttpStatus.OK);

}
	
}
