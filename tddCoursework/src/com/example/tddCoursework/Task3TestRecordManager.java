package com.example.tddCoursework;
/**
 * @author Dimo Dimchev
 * Student No:180322572
 *
 *Test cases for Task 3
 *Here I used TDD to develop my methods!
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import junit.framework.Assert;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Task3TestRecordManager extends AbstractLoggingJUnitTest {

	@Test
	public void changeNameTest() {
		RecordManager rec = new RecordManager();
		String first = "Jeorge";
		String second = "Dimo";
		rec.addStudent("0", first, "gosho@gmail.com","somewhere", "CompSci", "06.09.2019"); // format all imputs later
		rec.changeName("0", "Dimo");

		Assert.assertTrue(rec.getStudent("0").getName() == second);
	}

	
	@Test
	public void changePostalAdressTest() {
		RecordManager rec = new RecordManager();
		rec.addStudent("0", "Jeorge", "gosho@gmail.com","nowhere", "CompSci", "06.09.2019");
		String change="somewhere";
		rec.changeAdress("0",change);
		Assert.assertEquals(rec.getStudent("0").getPostalAdress(),change);
	}
	@Test
	public void addModuleTest() {
		RecordManager rec = new RecordManager();
		rec.addStudent("0", "Jeorge", "gosho@gmail.com","nowhere", "CompSci", "06.09.2019");
		rec.addModule("0", "NEB4321", "title",85,20);
		
	
	
	}
	
	@Test
	public void averageMarkTest() {
		RecordManager rec = new RecordManager();
		rec.addStudent("0", "Jeorge", "gosfdssadfho@gmail.com","nowhere", "CompSci", "06.09.2019");
		rec.addModule("0", "NBC3211", "gosho@gmail.com", 69, 20);
		rec.addModule("0", "NBD3121", "godasfasfho@gmail.com", 50, 20);
		rec.addModule("0", "ABC3121", "goshfasddfo@gmail.com", 80, 20);
		
		//we calculate the expected average by adding all of the marks and devideing to the number of them
		double expected = (69+50+80)/3;
		double mark = rec.averageMark("0");
		assertEquals(expected, mark,0.01);	 
	
		
	}
	
}
