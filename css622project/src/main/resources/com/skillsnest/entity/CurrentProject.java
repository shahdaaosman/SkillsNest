package com.skillsnest.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "currentProject")
public class CurrentProject extends Project{

	
	@Column
	private String startedDate;

	public String getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(String startedDate) {
		this.startedDate = startedDate;
	}

	@Override
	public String displayProjectDetails() {
		
		return "\n Project Title : "+ name +"\n Project Description : "
				+ description + "\n Started Date : " + startedDate
				+ "\n Project Required Skills : " + skillsList ;  
		
	}


	
	

}
