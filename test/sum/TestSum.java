package sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {
	
	@Test
	public void testSum2Num2(){
		assertEquals(4, sum(1, 3));
	}
	
	@Test
	public void testSumWithZero(){
		assertEquals(3, sum(3, 0));
	}
	
	@Test
	public void testSumWithNeg(){
		assertEquals(-5, sum(-9, 4));
	}
	
	
	int sum(int a, int b){
		return a + b;
	}
}
