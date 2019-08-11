package com.example.dem;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement
@Entity
@Table(name = "application")
public class Application {
	
	@Id
	@Column(name="applicationid")
	@JsonProperty("applicationId")
	private int applicationId;
	
	@Column(name="jobid")
	@JsonProperty("jobid")
	private int jobId;
	
	@Column(name="applicantname")
	@JsonProperty("applicantname")
	private String applicantName;
	
	public Application() {
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	
//	public Application(int applicationId, int jobId, String applicantName) {
//		this.applicationId = applicationId;
//		this.jobId = jobId;
//		this.applicantName = applicantName;
//	}
//	

}
