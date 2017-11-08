package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TruckTest {


		private Truck transport;
		
		@Before
		public void setup() {
			transport = new Truck (6);
		}
		
//		@Test
//		public void rate_should_return_amount_with_four_axle() {
//			Assert.assertEquals("this should return the amount for a truck with 4 axle", 6.60, transport.calculateToll(33), 0.01);
//		}
//		
		@Test
		public void should_return_amount_with_six_axle() {
			Assert.assertEquals("this should return the amount for a truck with 6 axle", 1.485, transport.calculateToll(33),0.01);
		}
}
//		@Test
//		public void should_return_amount_with_eight_axle() {
//			Assert.assertEquals("this should return the amount for a truck with 8axle", transport.getDeliveryMethod());
//		}
//	}


