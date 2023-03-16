package org.samplejunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FristDayClass {
	@Test
	public void testCase1() {
   System.out.println("This Is First Test Case" );
	}
   @Test
   public void testCase2() {
   System.out.println("This Is Second Test Case" );
   
}
   @Test
   public void testCase3() {
   System.out.println("This Is Third Test Case");
}
   @Before
   public void startDate() {
System.out.println("Test Case Starting Date And Time");


}
   @After
   public void endingDate() {
System.out.println("Test Case Ending Date And Time");
}


@BeforeClass
public static void preCondition() {
System.out.println("Browser Lanch");

}
@AfterClass
public static void postCondition() {
System.out.println("Close The Browser");
}

}
