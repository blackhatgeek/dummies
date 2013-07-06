package am.kdm.dummy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.lang.Math;


@RunWith(JUnit4.class)
public class SinusTest {
	private static final double ε=0.1;
	
	/****************** Tests for Sinus class's static methods - sinus function approximation ******************/
	/**
	 * Tests if sin(0) gives 0
	 */
	@Test
	public void testZero(){
		Assert.assertEquals(0,Sinus.sin(0),ε);
	}
	
	/**
	 * Tests if sin(π/2) gives 1
	 */
	@Test
	public void testHalfπ(){
		Assert.assertEquals(1,Sinus.sin(0.5*Math.PI),ε);
	}
	
	/**
	 * Tests if sin(π) gives 0
	 */
	@Test
	public void testπ(){
		Assert.assertEquals(0,Sinus.sin(Math.PI),ε);
	}
	
	/**
	 * Tests if sin(3π/2) gives -1
	 */
	@Test
	public void test3πHalves(){
		Assert.assertEquals(-1,Sinus.sin(3*Math.PI/2),ε);
	}
	
	/**
	 * Tests if sin(2π) gives 0
	 */
	@Test
	public void test2π(){
		Assert.assertEquals(0,Sinus.sin(2*Math.PI),ε);
	}
	
	/**
	 * Tests if sin(π/4) gives √2/2
	 */
	@Test
	public void testQuaterπ(){
		double expected=Math.sqrt(2)/2;
		Assert.assertEquals(expected,Sinus.sin(0.25*Math.PI),ε);
	}
	
	/**
	 * Tests if sin(3π/4) gives √2/2
	 */
	@Test
	public void test3πQuaters(){
		double expected=Math.sqrt(2)/2;
		Assert.assertEquals(expected,Sinus.sin(0.75*Math.PI),ε);
	}
	
	/**
	 * Tests if sin(3π) gives 0
	 */
	@Test
	public void test3π(){
		Assert.assertEquals(0,Sinus.sin(3*Math.PI),ε);
	}
	
	/**
	 * Tests if sin(-π/2) gives -1
	 */
	@Test
	public void testNegHalfπ(){
		Assert.assertEquals(-1,Sinus.sin(-0.5*Math.PI),ε);
	}
	
	/**
	 * Tests if sin(-2π) gives 0
	 */
	@Test
	public void testNeg2π(){
		Assert.assertEquals(0,Sinus.sin(-2*Math.PI),ε);
	}
	
	/**
	 * Tests sin2 method: given -0.5 should calculate sin(-π/2) and return -1
	 */
	@Test
	public void testSin2(){
		Assert.assertEquals(-1,Sinus.sin2(-0.5),ε);
	}
	
	/**
	 * Tests if sin(10π) gives 0
	 */
	@Test
	public void testSin10π(){
		Assert.assertEquals(0, Sinus.sin2(10),ε);
	}

}
