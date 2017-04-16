package com.in28minutes.junit.helper.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.in28minutes.junit.helper.StringHelper;

@RunWith(Parameterized.class)
public class ParameterizedArgTest {
	private static String input;
	private static String expectedOptput;
	
	StringHelper helper=new StringHelper();
	
	
	
	public ParameterizedArgTest(String input, String expectedOptput) {
		this.input = input;
		this.expectedOptput = expectedOptput;
	}

	@Parameters
	public static Collection<String[]> testCondition(){
		String expectedOutputs[][]={{"AACD","CD"},
				{"ACD","CD"}};
		return Arrays.asList(expectedOutputs);
		
	}

	@Test
	public void test_truncateAInFirst2Positions() {
		assertEquals(expectedOptput, helper.truncateAInFirst2Positions(input));
	}

}
