package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarWithTrailerTest {

	
	private CarWithTrailer transport;
	
	@Before
	public void setup() {
		transport = new CarWithTrailer ();
	}
	
	@Test
	public void rate_should_return_amount() {
		Assert.assertEquals("this should return the amount for a car with a trailer", 7.60, transport.calculateToll(33), 0.01);
	}
	
	@Test
	public void should_return_method() {
		Assert.assertEquals("this should return method", "Car with a Trailer", transport.getDeliveryMethod());
	}
}
