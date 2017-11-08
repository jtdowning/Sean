package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostalServiceFirstClassTest {

	private PostalServiceFirstClass transport;
	
	@Before
	public void setup () {
		transport = new PostalServiceFirstClass ();
	}
	
	@Test
	public void rate_should_return_distance_if_below_two() {
		Assert.assertEquals("this should return distance x 0.035", 1.155, transport.calculateRate(33,1), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_below_eight_and_above_two() {
		Assert.assertEquals("this should return distance x 0.040", 1.32, transport.calculateRate(33,5), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_below_fifteen_and_above_eight() {
		Assert.assertEquals("this should return distance x 0.047", 1.551, transport.calculateRate(33,11), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_below_sixtythree_and_above_fifteen() {
		Assert.assertEquals("this should return distance x 0.195", 6.435, transport.calculateRate(33,44), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_below_onefortythree_and_above_sixtythree() {
		Assert.assertEquals("this should return distance x 0.45", 14.85, transport.calculateRate(33,104), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_above_onefortythree() {
		Assert.assertEquals("this should return distance x 0.50", 16.50, transport.calculateRate(33,144), 0.01);
	}
}


