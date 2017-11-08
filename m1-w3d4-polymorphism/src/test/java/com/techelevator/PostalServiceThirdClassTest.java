package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostalServiceThirdClassTest {

	private PostalServiceThirdClass transport;
	
	@Before
	public void setup () {
		transport = new PostalServiceThirdClass();
	}
	
	@Test
	public void rate_should_return_distance_if_below_two() {
		Assert.assertEquals("this should return distance x 0.0020", 0.066, transport.calculateRate(33,1), 0.01);
	}
	

	@Test
	public void rate_should_return_distance_if_below_eight_and_above_two() {
		Assert.assertEquals("this should return distance x 0.0022", 0.726, transport.calculateRate(33,5), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_below_fifteen_and_above_eight() {
		Assert.assertEquals("this should return distance x 0.0024", 0.0792, transport.calculateRate(33,11), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_below_sixtythree_and_above_fifteen() {
		Assert.assertEquals("this should return distance x 0.0150", 0.495, transport.calculateRate(33,44), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_below_onefortythree_and_above_sixtythree() {
		Assert.assertEquals("this should return distance x 0.0160", 0.528, transport.calculateRate(33,104), 0.01);
	}
	
	@Test
	public void rate_should_return_distance_if_above_onefortythree() {
		Assert.assertEquals("this should return distance x 0.0170", 0.561, transport.calculateRate(33,144), 0.01);
	}
	
}
