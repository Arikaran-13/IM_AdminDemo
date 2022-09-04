package com.zensar.im.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="Candidates Information")
public class Candidate {
	@ApiModelProperty(value="candidate id")
	private int id;
	@ApiModelProperty(value="Candidate Name")
	private String name;
	@ApiModelProperty(value="Primary skills")
	private String PrimarySkills;
	@ApiModelProperty(value="Secondary skills")
	private String secondarySkills;
	@ApiModelProperty(value="experience of the candidate")
	private int exp;
	@ApiModelProperty(value="qualification")
	private String qualification;
	@ApiModelProperty(value="designation")
	private String desg;
	@ApiModelProperty(value="NoticePeriod")
	private int noticePeriod;
	@ApiModelProperty(value="Loation of the candidate")
	private String loc;
	
	
	
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", PrimarySkills=" + PrimarySkills + ", secondarySkills="
				+ secondarySkills + ", exp=" + exp + ", qualification=" + qualification + ", desg=" + desg
				+ ", noticePeriod=" + noticePeriod + ", loc=" + loc + "]";
	}
	public Candidate(int id, String name, String primarySkills, String secondarySkills, int exp, String q,
			String desg, int noticePeriod, String loc) {
		super();
		this.id = id;
		this.name = name;
		PrimarySkills = primarySkills;
		this.secondarySkills = secondarySkills;
		this.exp = exp;
		this.qualification = q;
		this.desg = desg;
		this.noticePeriod = noticePeriod;
		this.loc = loc;
	}
	public Candidate(String name, String primarySkills, String secondarySkills, int exp, String q,
			String desg, int noticePeriod, String loc) {
		super();
		this.name = name;
		PrimarySkills = primarySkills;
		this.secondarySkills = secondarySkills;
		this.exp = exp;
		this.qualification = q;
		this.desg = desg;
		this.noticePeriod = noticePeriod;
		this.loc = loc;
	}
	public Candidate() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrimarySkills() {
		return PrimarySkills;
	}
	public void setPrimarySkills(String primarySkills) {
		PrimarySkills = primarySkills;
	}
	public String getSecondarySkills() {
		return secondarySkills;
	}
	public void setSecondarySkills(String secondarySkills) {
		this.secondarySkills = secondarySkills;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	

}
