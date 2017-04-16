package com.ut.test;


import junit.framework.*;

public class JUnitTestHelloEx extends TestCase {
   protected int value1, value2;
   
   // assigning the values
   protected void setUp(){
      value1 = 3;
      value2 = 3;
   }

   // test method to add two values
   public void testAdd(){
      double result = value1 + value2;
      System.out.println("Total value:"+result);
      assertTrue(result == 6);
   }
   
}
