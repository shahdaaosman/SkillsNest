package com.skillsnest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int skillID;
	@Column
    private String name;
	@Column
    private String type;
	@Column
    private int avgLearningTime;
	@Column
    private int level;
	@Column
    private int timeTrack;
	@Column
    private Date date;
	@Column
    private Assessment AssessmentID;
	
	public Skill(int id,String string) {
		this.name = string;
		this.skillID = id;
	}
	public int getSkillID() {
		return skillID;
	}
	public void setSkillID(int skillID) {
		this.skillID = skillID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAvgLearningTime() {
		return avgLearningTime;
	}
	public void setAvgLearningTime(int avgLearningTime) {
		this.avgLearningTime = avgLearningTime;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getTimeTrack() {
		return timeTrack;
	}
	public void setTimeTrack(int timeTrack) {
		this.timeTrack = timeTrack;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Assessment getAssessmentID() {
		return AssessmentID;
	}
	public void setAssessmentID(Assessment assessmentID) {
		AssessmentID = assessmentID;
	}
	@Override
    public String toString(){
        return name;
    }
	
	
}
