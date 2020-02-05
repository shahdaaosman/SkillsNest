package com.skillsnest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assessment")
public class Assessment {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int assessmentID;
	@Column
    private String title;
	@Column
    private String type;// live test
	@Column
    private Skill skillName;
	@Column
    private List<Question> QuestionsList;
	public int getAssessmentID() {
		return assessmentID;
	}
	public void setAssessmentID(int assessmentID) {
		this.assessmentID = assessmentID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Skill getSkillName() {
		return skillName;
	}
	public void setSkillName(Skill skillName) {
		this.skillName = skillName;
	}
	public List<Question> getQuestionsList() {
		return QuestionsList;
	}
	public void setQuestionsList(List<Question> questionsList) {
		QuestionsList = questionsList;
	}
	
	
}
