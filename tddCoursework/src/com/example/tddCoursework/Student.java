package com.example.tddCoursework;
/**
 * @author  Dimo Dimchev
 * @StudentNo 180322572
* @version 1.0
* @since   26/11/2019 
* The student class creates a object of type Student that stores this information:unchangeable ID, name, postal address, e-mail address,
*  degree course title and the date they first enrolled on the course and an ArrayList of classes type Module.
* 
*|||UML Changes|||
*
*There is a constuctor that sets all of the values when a student is created.
*I have added a method that is called getModule,so I can easily get find a module from the list.
*
*I have added a getList(),which returns the ArrayList of the current Student object.

*/
import java.util.ArrayList;

public class Student {
	private final String id;
	private String name;
	private String mail;
	private String postalAdress;
	private String degreeTitle;
	private String degreeFirstDate;

	private ArrayList<Module> list = new ArrayList<Module>();

	public Student(String id, String name, String mail, String adress, String DegreeTitle, String degreeFirstDate) {
		this.id = id;
		this.setName(name);
		this.setMail(mail);
		this.setPostalAdress(adress);
		this.setDegreeTitle(DegreeTitle);
		this.setDegreeFirstDate(degreeFirstDate);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		if (mail.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
			this.mail = mail;
		} else {
			throw new IllegalArgumentException("The email you have entered is not valid!");
		}
	}

	public String getDegreeTitle() {
		return degreeTitle;
	}

	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	public String getDegreeFirstDate() {
		return degreeFirstDate;
	}

	public void setDegreeFirstDate(String degreeFirstDate) {
		this.degreeFirstDate = degreeFirstDate;
	}

	public ArrayList<Module> getList() {
		return list;
	}

	public void addModule(String code, String title, int mark, int credits) {
		Module mod = new Module(code, title, mark, credits);
		list.add(mod);
	}

	public String getPostalAdress() {
		return postalAdress;
	}

	public void setPostalAdress(String postalAdress) {
		this.postalAdress = postalAdress;
	}

	public Module getModule(String code) {// added after uml
		for (Module e : list) {
			if (e.getCode() == code) {
				return e;
			}
		}
		return null;
	}
}
