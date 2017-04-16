package com.in28minutes.junit.helper.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAfterTestCase {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before test run");
	}

	@Test
	public void test1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	public void test2(){
		System.out.println("Test Case 2");
	}
	
	@After
	public void afterTestCase(){
		System.out.println("After testCases");
	}

}
