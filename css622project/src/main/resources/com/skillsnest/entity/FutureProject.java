package com.skillsnest.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "futureProject")
public class FutureProject extends Project{

	@Column
	private long estimatedBudget;

	public long getEstimatedBudget() {
		return estimatedBudget;
	}

	public void setEstimatedBudget(long estimatedBudget) {
		this.estimatedBudget = estimatedBudget;
	}

	@Override
	public String displayProjectDetails() {
		
		return "\n Project Title : "+ name +"\n Project Description : "
				+ description + "\n Estimated Budget :" + estimatedBudget
				+ "\n Project Required Skills :" + skillsList ;   
		
	

	}
	
	

}
