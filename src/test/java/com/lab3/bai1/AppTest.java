package com.lab3.bai1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class AppTest {

   @BeforeClass
   public static void intAll() {
      System.out.println("@BeforeClass - Run before all methods once");
   }

   @Before
   public void init() {
      System.out.println("@Before - Run before each method");
   }

   @DisplayName("First test")
   @Test
   public void testMethod1() {
      System.out.println("    Test method 1");
   }

   @Test
   @Ignore
   public void testMethod2() {
      System.out.println("    Test method 2");
   }

   @After
   public void tearDown() {
      System.out.println("@After - Run after each method");
   }

   @AfterClass
   public static void tearDownAll() {
      System.out.println("@AfterClass - Run after all methods once");
   }
}