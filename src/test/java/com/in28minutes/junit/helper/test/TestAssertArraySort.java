package com.in28minutes.junit.helper.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestAssertArraySort {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before method");
	}

	@Test
	public void test1() {
		int[] number={12,3,4,10};
		int[] expected={3,4,10,12};
		Arrays.sort(number);
		assertArrayEquals(expected,number);
	}

	
	/*@Test
	public void testSortArray() {
		int[] number=null;
		int[] expected={3,4,10,12};
		
		Arrays.sort(number);
		assertArrayEquals(expected,number);
		try {
			Arrays.sort(number);
			System.out.println("number"+number);
			assertArrayEquals(expected,number);
		} catch (NullPointerException e) {
			System.out.println("getting nullpointer Exception");
		}
	}
	
*/
	

	@Test(expected=NullPointerException.class)
	public void testSortArray() {
		int[] number=null;
		System.out.println("Number:"+number);
		Arrays.sort(number);
	}
	
	
}
