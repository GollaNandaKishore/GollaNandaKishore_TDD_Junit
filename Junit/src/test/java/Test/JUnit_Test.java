package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import TDD_Junit.Junit_Demo;

public class JUnit_Test {
Junit_Demo obj=new Junit_Demo();
	@Test
	public void test() {
		assertEquals(Junit_Demo.cal("ABCD"),"BCD");
		assertEquals(Junit_Demo.cal("AACD"),"CD");
		assertEquals(Junit_Demo.cal("BACD"),"BCD");
		assertEquals(Junit_Demo.cal("BBAA"),"BBAA");
		assertEquals(Junit_Demo.cal("AABAA"),"BAA");
	}

}
