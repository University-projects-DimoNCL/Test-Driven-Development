package com.example.tddCoursework;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
/**
 * @author Dimo Dimchev
 * Student No:180322572
 *
 *
 *Tests if the added student object is added and if its the same one.
 */
public class Task2TestStudent {

	@Test
	public void test() {
		Student a = new Student("0", "Jeorge", "gosho@gmail.com","nowhere", "CompSci", "06.09.2019");
		a.addModule("NBD3121", "godasfasfho@gmail.com", 50, 20);
		Module expected = new Module("NBD3121", "godasfasfho@gmail.com", 50, 20);
		Module actual = a.getList().get(0);
		assertEquals(expected.getMark(), actual.getMark());
		assertEquals(expected.getCode(), actual.getCode());
		assertEquals(expected.getCredits(), actual.getCredits());
		assertEquals(expected.getTitle(), actual.getTitle());
		assertEquals(expected.getClass(),actual.getClass());
	}

}
