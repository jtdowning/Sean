package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	
private KataFizzBuzz fb;	

@Before
public void setup () {
	fb = new KataFizzBuzz();
	
}
	
@Test
public void fizz_buzz_1_should_return_1 () {
	KataFizzBuzz fb = new KataFizzBuzz();
	
	String result = fb.fizzBuzz(1);
	
	Assert.assertEquals("one should return one","1", result);
	
	}

@Test
public void fizz_buzz_1_should_return_2 () {
	KataFizzBuzz fb = new KataFizzBuzz();
	
	String result = fb.fizzBuzz(2);
	
	Assert.assertEquals("two should return two", "2", result);
	
	}

@Test
public void fizz_buzz_3_should_return_fizz() {
	String result = fb.fizzBuzz(3);
	
	Assert.assertEquals("3 should return fizz","fizz", result);

	}

@Test
public void fizz_buzz_4_should_return_4() {
	String result = fb.fizzBuzz(4);
	
	Assert.assertEquals("4 should return 4", "4", result);
	}

@Test
public void fizz_buzz_5_should_return_5() {
	String result = fb.fizzBuzz(5);
	
	Assert.assertEquals("5 should return buzz", "buzz", result);
	}

@Test
public void fizz_buzz_6_should_return_fizz() {
	String result = fb.fizzBuzz(6);
	
	Assert.assertEquals("6 should return fizz","fizz", result);
	}

@Test
public void fizz_buzz_10_should_return_buzz() {
	String result = fb.fizzBuzz(10);
	
	Assert.assertEquals("10 should return buzz", "buzz", result);
	}

@Test
public void fizz_buzz_13_should_return_fizz() {
	String result = fb.fizzBuzz(13);
	
	Assert.assertEquals("13 should return fizz", "fizz", result);
}
@Test
public void fizz_buzz_1e2_should_return_fizz() {
	String result = fb.fizzBuzz(12);
	Assert.assertEquals("12 should retrun fizz", "fizz", result);
}

@Test
public void fizz_buzz_15_should_return_fizz_buzz() {
	String result = fb.fizzBuzz(15);
	Assert.assertEquals("15 should return fizz buzz", "fizz buzz", result);
}

@Test
public void fizz_buzz_52_should_return_buzz() {
	String result = fb.fizzBuzz(52);
	Assert.assertEquals("52 should return buzz", "buzz", result);
}

@Test
public void fizz_buzz_53_should_return_fizz_buzz () {
	String result = fb.fizzBuzz(53);
	Assert.assertEquals("53 should return fizz buzz",  "fizz buzz", result);
}


}
