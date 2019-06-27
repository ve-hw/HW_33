package core;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

public class CalculatorTest {
	
	@Test(timeout=1000) //@Ignore
	public void test_01_add_2() {System.out.println ("Test # 01: add 2 parameters");
	assertEquals("Not Correct", Calculator.add(200, 150), 350, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_02_add_3() {System.out.println ("Test # 02: add 3 parameters");
	assertEquals("Not Correct", Calculator.add(200, 150, 500), 850, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_03_add_4() {System.out.println ("Test # 03: add 4 parameters");
	assertEquals("Not Correct", Calculator.add(200, 150, 500, 250), 1100, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_04_divide_2() {System.out.println ("Test # 04: divide 2 parameters");
	assertEquals("Not Correct", Calculator.divide(200, 100), 2, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_05_divide_3() {System.out.println ("Test # 05: divide 3 parameters");
	assertEquals("Not Correct", Calculator.divide(2000, 2, 1000), 1, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_06_divide_4() {System.out.println ("Test # 06: divide 4 parameters");
	assertEquals("Not Correct", Calculator.divide(1000, 10, 2, 5), 10, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_07_multiply_2() {System.out.println ("Test # 07: multiply 2 parameters");
	assertEquals("Not Correct", Calculator.multiply(200, 10), 2000, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_08_multiply_3() {System.out.println ("Test # 08: multiply 3 parameters");
	assertEquals("Not Correct", Calculator.multiply(20, 2, 3), 120, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_09_multiply_4() {System.out.println ("Test # 09: multiply 4 parameters");
	assertEquals("Not Correct", Calculator.multiply(15, 10, 2, 10), 3000, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_10_subtract_2() {System.out.println ("Test # 10: subtract 2 parameters");
	assertEquals("Not Correct", Calculator.subtract(200, 10), 190, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_11_subtract_3() {System.out.println ("Test # 11: subtract 3 parameters");
	assertEquals("Not Correct", Calculator.subtract(20, 2, 3), 15, 0.09);}
	
	@Test(timeout=1000) //@Ignore
	public void test_12_subtract_4() {System.out.println ("Test # 12: subtract 4 parameters");
	assertEquals("Not Correct", Calculator.subtract(15, 10, 2, 1), 2, 0.09);}

}
