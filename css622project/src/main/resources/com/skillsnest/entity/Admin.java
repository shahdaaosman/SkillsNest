package com.skillsnest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin extends User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int adminID;
	@Column
    private List<Project> projectsList;
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public List<Project> getProjectsList() {
		return projectsList;
	}
	public void setProjectsList(List<Project> projectsList) {
		this.projectsList = projectsList;
	}
	
	public void setRole() {
		this.role = "admin";
	}
	
}
