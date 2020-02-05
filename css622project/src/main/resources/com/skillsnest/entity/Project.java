package com.skillsnest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public abstract class Project {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	protected int projectID;
	@Column
	protected String name;
	@Column
	protected String description;
	@Column
	protected String location;
	@Column
	protected String duration;
	@Column
	protected List<Employee> employeesList;
	@Column
	protected List<Skill> skillsList;
	
	abstract String displayProjectDetails();
	
	public int getProjectID() {
		return projectID;
	}
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public List<Employee> getEmployeesList() {
		return employeesList;
	}
	public void setEmployeesList(List<Employee> employeesList) {
		this.employeesList = employeesList;
	}
	public List<Skill> getSkillsList() {
		return skillsList;
	}
	public void setSkillsList(List<Skill> skillsList) {
		this.skillsList = skillsList;
	}
	

	
}
