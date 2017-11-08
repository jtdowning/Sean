package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SPUNextDayTest {

	
	private SPUNextDay transport;
	
	@Before
	public void setup() {
		transport = new SPUNextDay ();
	}
	
	@Test
	public void rate_should_return_amount() {
		Assert.assertEquals("this should return the amoun SPU will charge", 12.375, transport.calculateRate(33, 5), 0.01);
	}
	
	@Test
	public void should_return_method() {
		Assert.assertEquals("this should return method", "SPU - (4-day ground)", transport.getDeliveryMethod());
	}
}