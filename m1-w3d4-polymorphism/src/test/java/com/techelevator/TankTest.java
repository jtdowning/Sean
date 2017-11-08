package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TankTest {


		
		private Tank transport;
		
		@Before
		public void setup() {
			transport = new Tank ();
		}
		
		@Test
		public void rate_should_return_amount() {
			Assert.assertEquals("this should return the distance travelled", 33, transport.calculateToll(33), 0.01);
		}
		
		@Test
		public void should_return_method() {
			Assert.assertEquals("this should return method", "TANK", transport.getDeliveryMethod());
		}
	}

