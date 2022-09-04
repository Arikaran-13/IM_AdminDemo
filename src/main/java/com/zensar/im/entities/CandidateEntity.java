package com.zensar.im.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="candidate")

public class CandidateEntity {
	@Id
	
	private int id;
	@Column(name="candidate_name")
	
	private String name;
	
	@Column(name="primary_skills")
	private String PrimarySkills;
	
	@Column(name="secondary_skills")
	
	private String secondarySkills;
	
	@Column(name="experience")
	private int exp;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="designation")
	private String desg;
	
	@Column(name="notice_period")
	private int noticePeriod;
	
	@Column(name="location")
	private String loc;
	
}
