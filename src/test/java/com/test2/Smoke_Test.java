package com.test2;

import org.testng.Assert;
import org.testng.annotations.Test;





public class Smoke_Test {

	
	@Test(priority=1)
	public void test1_Smoke() {
	Assert.assertEquals(3, 3);	
	}
	

	@Test(priority=2)
	public void test2_Smoke() {
	Assert.assertEquals('z', 'z');	
	}
	
	

	@Test(priority=3)
	public void test3_Smoke() {
	Assert.assertEquals(2, 2);	
	}
}
