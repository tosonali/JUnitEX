package com.in28minutes.junit.helper.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.in28minutes.junit.helper.StringHelper;

public class StringHelperTest {

	StringHelper helper=new StringHelper();
	String msg="Sonali";
	@Test
	public void test() {
		System.out.println("int test()");
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("AAAA"));
		
	}
	@Test
	public void test2(){
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void sayHello(){
		System.out.println("IN hello test case");
		assertEquals("Sonali",helper.sendMessage(msg));
		
	}

}
