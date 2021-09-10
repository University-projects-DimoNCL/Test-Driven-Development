package com.example.tddCoursework;
/**
 * @author  Dimo Dimchev
 * @StudentNo 180322572
* @version 1.0
* @since   26/11/2019 
* The module class creates an object ,which holds the values of the module code,the module title, the module mark and the number of credits for that module.
* 
* It is used to create new Modules,which then can be stored in the student class
* 
*|||UML Changes|||
*
* The only thing that is different than the UML is that the class has a constuctor that sets all of the values,
* when an object is initialized.

*/
public class Module {
private String code;
private String title;
private int mark;
private int credits;
public Module(String code,String title,int mark,int credits) {
this.setCode(code);
this.setTitle(title);
this.setMark(mark);
this.setCredits(credits);
}


public String getCode() {
	return code;
}
public void setCode(String code) {
	
if(code.matches("^[A-Z|a-z]{3}[0-9]{4}")) {this.code = code;}
		else {
			throw new IllegalArgumentException("Code should consist of 3 letters and 4 numbers ");}
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	if(mark<1||mark>100) {
		throw new IllegalArgumentException("Mark should bebetwean 1 and 100");
	}
	else {	 this.mark=mark;}
	
	};

public int getCredits() {
	return credits;
}
public void setCredits(int credits) {
	this.credits = credits;
}


}
