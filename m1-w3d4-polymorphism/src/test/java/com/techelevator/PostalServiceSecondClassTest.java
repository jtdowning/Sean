package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostalServiceSecondClassTest {

	private PostalServiceSecondClass transport;
	
	@Before
	public void setup () {
		transport = new PostalServiceSecondClass();
	}
	
	@Test
	public void rate_should_return_distance_if_below_two() {
		Assert.assertEquals("this should return distance x 0.0035", 0.1155, transport.calculateRate(33,1), 0.01);
	}
	

	@Test
	public void rate_should_return_distance_if_below_eight_and_above_two() {
		Assert.assertEquals("this should return distance x 0.0040", 0.132, transport.calculateRate(33,5), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_below_fifteen_and_above_eight() {
		Assert.assertEquals("this should return distance x 0.0047", 0.1551, transport.calculateRate(33,11), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_below_sixtythree_and_above_fifteen() {
		Assert.assertEquals("this should return distance x 0.0195", 0.6435, transport.calculateRate(33,44), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_below_onefortythree_and_above_sixtythree() {
		Assert.assertEquals("this should return distance x 0.045", 1.485, transport.calculateRate(33,104), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_above_onefortythree() {
		Assert.assertEquals("this should return distance x 0.050", 1.650, transport.calculateRate(33,144), 0.01);
	}
	
}


