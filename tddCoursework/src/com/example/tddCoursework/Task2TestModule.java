package com.example.tddCoursework;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author Dimo Dimchev
 * Student No:180322572
 * 
 * This is mainly to test if an Exception is trown when there is a out of bounds mark.
 */
public class Task2TestModule {

	@Test (expected = IllegalArgumentException.class)
	public void markTest() {
	Module a = new Module("NEB4757","title",50,20);
	  
	a.setMark(-50);
	}

	@Test
	public void markTest2() {
		Module a = new Module("neb4757","title",50,20);
		  
		 int actual=a.getMark();
		assertEquals(50, actual);
	}
	@Test (expected = IllegalArgumentException.class)
	public void codeTest() {
		Module a = new Module("code","title",50,20);
		  //this should throw an exception, because code is not 3 letters and 4 numbers
		
	}
}
