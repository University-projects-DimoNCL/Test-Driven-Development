/**
 * 
 */
package com.example.tddCoursework;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

/**
 * @author Dimo Dimchev
 * Student No:180322572
 *
 *Here I check if the RecordManager() actually adds students to the ArrayList
 */
public class Task2TestRecordManager {

	/**
	 * @throws java.lang.Exception
	 */

	
	@Test
	public void addStudentTest() {
		RecordManager rec = new RecordManager();
		rec.addStudent("0", "Jeorge", "gosho@gmail.com","nowhere", "CompSci", "06.09.2019");
		Student actual = rec.getArray().get(0);
		Student expected = new Student("0", "Jeorge", "gosho@gmail.com","nowhere", "CompSci", "06.09.2019");
		assertEquals(expected.getName(), actual.getName());
		assertEquals(expected.getPostalAdress(),actual.getPostalAdress());
		assertEquals(expected.getMail(),actual.getMail());
		assertEquals(expected.getId(),actual.getId());
		assertEquals(expected.getDegreeTitle(),actual.getDegreeTitle());
		assertEquals(expected.getDegreeFirstDate(),actual.getDegreeFirstDate());
		assertEquals(expected.getClass(),actual.getClass());
	}

}
