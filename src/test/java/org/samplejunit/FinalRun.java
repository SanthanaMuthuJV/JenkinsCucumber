package org.samplejunit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

       //Way 1 of Suite level execution by using @RunWith(Suite.class) and @SuiteClasses({classname.class,classname.class})
// @RunWith(Suite.class)
// @SuiteClasses({ SuiteSample1.class, SuiteSample2.class, SuiteSample3.class })
public class FinalRun {
	@Test
	public void testRun() {
		// Way 2 of Suite level execution by using JUnitCore.runClasses(classname.class,classname.class)
    Result rc = JUnitCore.runClasses(SuiteSample1.class, SuiteSample2.class, SuiteSample3.class );
    
    long rt = rc.getRunTime();
    System.out.println(" Get The RunTime " + rt);
    
    int rCount = rc.getRunCount();
    System.out.println(" Get The Run count " + rCount);
    
    int fc = rc.getFailureCount();
    System.out.println(" Get The Failure count " + fc);
    
    int ic = rc.getIgnoreCount();
    System.out.println(" Get The Ignore count " + ic);
    
    List<Failure> failures = rc.getFailures();
    for (Failure f : failures) {
    	 System.out.println(" Get The Reason of Failure " + f);
	}
		
	}

	}


