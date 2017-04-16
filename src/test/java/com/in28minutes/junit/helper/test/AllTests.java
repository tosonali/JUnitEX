package com.in28minutes.junit.helper.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ParameterizedArgTest.class, StringHelperTest.class ,TestAssertArraySort.class})
public class AllTests {

}
