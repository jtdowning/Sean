package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FexEdTest {
	
	private FexEd transport;
	
	@Before
	public void setup () {
		transport = new FexEd ();
	}
	
	@Test
	public void rate_should_return_twenty() {
		Assert.assertEquals("Should have value of 20.00", 20.00, transport.calculateRate(20, 15), 0.01);
		
	}

	@Test
	public void rate_should_return_twenty_eight() {
		Assert.assertEquals("Should have value of 28.00", 28.00, transport.calculateRate(3333, 49), 0.01);
	}
	
	@Test
	public void rate_should_return_twenty_five() {
		Assert.assertEquals("Should have value of 25.00", 25.00, transport.calculateRate(3333, 47), 0.01);
	}	
	
	@Test
	public void rate_should_return_twenty_three() {
		Assert.assertEquals("Should have value of 23.00", 23.00, transport.calculateRate(499, 49), 0.01);
	}
	
	@Test
	public void rate_should_return_twenty_five_part_two() {
		Assert.assertEquals("Should have value of 25.00", 25.00, transport.calculateRate(501, 47), 0.01);
	}

	
	@Test
	public void name_should_return_delivery_method () {
		Assert.assertEquals("Should return delivery method name", "FexEd", transport.getDeliveryMethod());
	}
}

