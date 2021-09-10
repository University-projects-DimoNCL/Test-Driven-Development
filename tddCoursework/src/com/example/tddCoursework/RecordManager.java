package com.example.tddCoursework;
/**
 * @author  Dimo Dimchev
 * @StudentNo 180322572
* @version 1.0
* @since   26/11/2019 
* The record manager class is used to store Student objects inside a ArrayList.
* 
*|||UML Changes|||
*
*I have added a Test() method to help me test my program .Tasks 1-5
*I have added a getArray() that would help me to test the class with Junit(because the Arraylist is private)
*I have added the change Name and adress methods which were not on the UML Diagram
*
*/
import java.util.ArrayList;

public class RecordManager {

	private ArrayList<Student> studentList = new ArrayList<Student>();

	public ArrayList<Student> getArray() {
		return studentList;
	}

	public void addStudent(String id, String name, String mail, String adress, String DegreeTitle,
			String degreeFirstDate) {
		Student stud = new Student(id, name, mail, adress, DegreeTitle, degreeFirstDate);
		studentList.add(stud);
	};

	public String search(String name) {
		StringBuilder finalString = new StringBuilder();
		for (Student a : studentList) {
			if (a.getName() == name) {
				StringBuilder sb = new StringBuilder();
				sb.append("\n\tWe have a Match!\n");
				sb.append("Id - " + a.getId() + " Name - " + a.getName() + " E-mail- " + a.getMail() + " Course - "
						+ a.getDegreeTitle() + " DateOfDegreeStart " + a.getDegreeFirstDate());
				sb.append("\n");
				sb.append("\tThe student takes these modules:\n");
				for (Module e : a.getList()) {
					sb.append("Module with code " + e.getCode() + ", title " + e.getTitle() + ",has a mark of "
							+ e.getMark() + " and gets " + e.getCredits() + "credits for the module!\n");
				}
				finalString.append(sb);
			}
		}
		System.out.println(finalString.toString());
		return finalString.toString();
	}

	public double averageMark(String id) {
		int count = 0;
		int marksum = 0;
		if(this.studentList.isEmpty()) {throw new NullPointerException("List is empty...");}
		
		for (Student a : studentList) {
			
			if (a.getId() == id) {
				for (Module m : a.getList()) {
					marksum += m.getMark();
					count++;
				}
			}
		}

		return marksum / count;
	}

	public void printList() {
		StringBuilder sb = new StringBuilder("");
		for (Student a : studentList) {
			sb.append("Id - " + a.getId() + " Name - " + a.getName() + " E-mail- " + a.getMail() + " Course - "
					+ a.getDegreeTitle() + " DateOfDegreeStart " + a.getDegreeFirstDate());
			sb.append("\n");
			sb.append("\tThe student takes these modules:\n");
			for (Module e : a.getList()) {
				sb.append("Module with code " + e.getCode() + ", title " + e.getTitle() + ",has a mark of "
						+ e.getMark() + " and gets " + e.getCredits() + " credits for the module!\n");
			}
		}
		System.out.println(sb.toString());
	}



	public void Test() {

		
		this.addStudent("0", "Jeorge", "gosho@gmail.com","nowhere", "CompSci", "06.09.2019");
		this.addModule("0", "csc2234", "Juiop", 10, 20);
		this.printList();
		// this.search(name);
		/*
		 * 
		 * System.out.println("The average mark of student with Id 0 is
		 * "+this.averageMark(0)+"%");
		 **/

		// this.search("dude2d");

	}

	public Student getStudent(String id) {
		for (Student a : studentList) {
			if (a.getId().equals(id)) {
				return a;
			}
		}

		return null;
	}

	public void changeName(String id, String name) {
		Student a = this.getStudent(id);
		a.setName(name);
	}

	public void changeAdress(String id, String adress) {
		Student a = this.getStudent(id);
		a.setPostalAdress(adress);

	}

	public void addModule(String id, String code, String title, int mark, int credits) {// added after uml
		Student a = this.getStudent(id);

		a.addModule(code, title, mark, credits);
	}
}
