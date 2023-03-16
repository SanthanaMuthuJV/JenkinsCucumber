package org.samplejunit;

import java.util.Date;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SuiteSample2 extends BaseClass {
	@Test
public void tc202() {
browserLanch();
urlLanch("https://www.whatsapp.com/");
}
	@Test
public void tc203() {
browserLanch();
urlLanch("https://www.instagram.com/");
}

@Before
public void startDate() {
Date d = new Date();
System.out.println("start date"+d);
}
@After
public void endDate() {
Date d = new Date();
System.out.println("end date"+d);
}
}
