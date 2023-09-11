package com.gl.Q1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProjectSerializer {
	private Map<Project, ArrayList<Employee>> projectMap1 = new HashMap<>();
	private ArrayList<Employee> elist1 = new ArrayList<>();
	private ArrayList<Employee> elist2 = new ArrayList<>();
	private ArrayList<Employee> elist3 = new ArrayList<>();

	public ProjectSerializer() {
		
		Project project1 = new Project("P1", "Music Synthesizer", 23);
		Project project2 = new Project("P2", "Vehicle Movement Tracker", 13);
		Project project3 = new Project("P3", "Liquid Viscosity Finder", 15);

		Employee e1 = new Employee("E001", "Harsha", "9383993933", "RTNagar", 1000);
		Employee e2 = new Employee("E002", "Harish", "9354693933", "Jayanagar", 2000);
		Employee e3 = new Employee("E003", "Meenal", "9383976833", "Malleswaram", 1500);
		elist1.add(e1);
		elist1.add(e2);
		elist1.add(e3);

		Employee e4 = new Employee("E004", "Sundar", "9334593933", "Vijayanagar", 3000);
		Employee e5 = new Employee("E005", "Suman", "9383678933", "Indiranagar", 2000);
		Employee e6 = new Employee("E006", "Suma", "9385493933", "KRPuram", 1750);
		elist2.add(e4);
		elist2.add(e5);
		elist2.add(e6);

		Employee e7 = new Employee("E007", "Chitra", "9383978933", "Koramangala", 4000);
		Employee e8 = new Employee("E008", "Suraj", "9383992133", "Malleswaram", 3000);
		Employee e9 = new Employee("E009", "Manu", "9345193933", "RTNagar", 2000);
		elist3.add(e7);
		elist3.add(e8);
		elist3.add(e9);

		projectMap1.put(project1, elist1);
		projectMap1.put(project2, elist2);
		projectMap1.put(project3, elist3);
	}

	public void serializeProjectDetails(Map<Project, ArrayList<Employee>> data) {
		try {
			FileOutputStream fileOut = new FileOutputStream("project_data.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);

			out.writeObject(data);

			out.close();
			fileOut.close();

			System.out.println("Project details serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deserializeProjectDetails() {
		try {
			FileInputStream fileIn = new FileInputStream("project_data.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);

			Map<Project, ArrayList<Employee>> deserializedData = (Map<Project, ArrayList<Employee>>) in.readObject();

			in.close();
			fileIn.close();

			for (Map.Entry<Project, ArrayList<Employee>> entry : deserializedData.entrySet()) {
				Project project = entry.getKey();
				ArrayList<Employee> employees = entry.getValue();

				System.out.println(project);
				System.out.println("Employees:");

				for (Employee employee : employees) {
					System.out.println(employee);
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ProjectSerializer projectSerializer = new ProjectSerializer();

		projectSerializer.serializeProjectDetails(projectSerializer.projectMap1);

		projectSerializer.deserializeProjectDetails();
	}
}
