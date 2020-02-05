package com.skillsnest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends User{


	//@Column
   // private List<Qualification> QualificationsList;
	@Column
    private int trainingHours;
	@Column
    private List<Skill> skillsList;
	@Column
    private Project projectID;
	public Employee(int id, String firstName, String lastName, String email) {
		this.id = id;
	}

	public int getTrainingHours() {
		return trainingHours;
	}
	public void setTrainingHours(int trainingHours) {
		this.trainingHours = trainingHours;
	}
	public List<Skill> getSkillsList() {
		return skillsList;
	}
	public void setSkillsList(List<Skill> skillsList) {
		this.skillsList = skillsList;
	}
	public Project getProjectID() {
		return projectID;
	}
	public void setProjectID(Project projectTitle) {
		this.projectID = projectTitle;
	}
	
	public void setRole() {
		this.role = "employee";
	}
	
	
	

	
	
	
}
