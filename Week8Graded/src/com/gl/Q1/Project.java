package com.gl.Q1;

import java.io.Serializable;

public class Project implements Serializable {
    private String projectCode;
    private String projectName;
    private int projectStrength;
    
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectCode, String projectName, int projectStrength) {
		super();
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectStrength = projectStrength;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectStrength() {
		return projectStrength;
	}

	public void setProjectStrength(int projectStrength) {
		this.projectStrength = projectStrength;
	}

	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", projectName=" + projectName + ", projectStrength="
				+ projectStrength + "]";
	}

    
}
