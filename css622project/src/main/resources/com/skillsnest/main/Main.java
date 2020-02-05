package com.skillsnest.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.skillsnest.entity.CurrentProject;
import com.skillsnest.entity.Employee;
import com.skillsnest.entity.FutureProject;
import com.skillsnest.entity.Project;
import com.skillsnest.entity.Skill;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		List<Project> projectList = new ArrayList<Project>();
		FutureProject newProject = new FutureProject();
		CurrentProject existProject = new CurrentProject();
		newProject.setName("Customer Service Application");
		newProject.setDescription("A Description for the Customer Service Application");
		newProject.setEstimatedBudget(220000);
		List<Skill> skillsList_1 = new ArrayList<Skill>();
		Skill skill_1= new Skill(1,"Java");
		Skill skill_2= new Skill(2,"MySQL");
		Skill skill_3= new Skill(3,"JS");
		skillsList_1.add(skill_1);
		skillsList_1.add(skill_2);
		skillsList_1.add(skill_3);
		newProject.setSkillsList(skillsList_1);
		projectList.add(newProject);
		
		existProject.setName("Sales Tracking System");
		existProject.setDescription("A Description for the Sales Traking System");
		existProject.setStartedDate("11/15/2019");
		List<Skill> skillsList_2 = new ArrayList<Skill>();
		Skill skill_4= new Skill(1,"PHP");
		skillsList_2.add(skill_2);
		skillsList_2.add(skill_3);
		skillsList_2.add(skill_4);
		existProject.setSkillsList(skillsList_2);
		projectList.add(existProject);
		
		
//		System.out.println(newProject.displayProjectDetails());
	//	System.out.println(existProject.displayProjectDetails());
		
		
	//	Project testDowncastingProject = new FutureProject();
		//testDowncastingProject.setName("Employees Attendance  System");
	//	testDowncastingProject.setDescription("A Description for the Employees Attendance  System");
	//	((CurrentProject) testDowncastingProject).setStartedDate("1/2/2020");
		
		// Create linkedList data structure to save the employee data inside it
				LinkedList<Employee> employeeData = new LinkedList<Employee>();
				createDataList(employeeData);
				System.out.println(employeeData);
	}
	
	/**
	 * This method creates a data list for Employees from text file
	 * @param employeeData
	 */
	private static void createDataList(LinkedList<Employee> employeeData) {
		// Open file
		File file = new File("employeeData.txt");

		// Read all employees data from the input file and store them in an appropriate data
		// structure, employeeData
		Scanner scanner;

		try {
			scanner = new Scanner(file);

			while (scanner.hasNextLine()) {

				String line = scanner.nextLine();
				String[] employeData = line.split("\\s+");
				//get value from file
				String id = employeData[0];
				String firstName = employeData[1];
				String lastName = employeData[2];
				String email = employeData[3];

				// Create a new Process object for each line in file
        		Employee employee = new Employee(Integer.parseInt(id), firstName, lastName, email);

        		employeeData.add(employee);

			}

			scanner.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
