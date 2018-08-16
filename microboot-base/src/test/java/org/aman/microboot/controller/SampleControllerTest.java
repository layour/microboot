package org.aman.microboot.controller;

import org.aman.microboot.controller.SampleController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

@SpringBootTest(classes=SampleController.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SampleControllerTest {

	@Autowired
	private SampleController sampleController;
	
	@Test
	public void testHome() {
		TestCase.assertEquals(this.sampleController.home(), "Hello World!");
	}
}
