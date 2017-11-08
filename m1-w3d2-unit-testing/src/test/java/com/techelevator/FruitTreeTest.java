package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class FruitTreeTest {
	
	private FruitTree tree; 

	@Before
	public void setup() { 
		tree = new FruitTree ("Apples", 5);
	}
	
	@Test
	public void fruit_tree_initializes_correctly() {
		// Arrange
		
		// Act
		
		// Assert
		Assert.assertEquals("The tree should contain apples,", "Apples", tree.getTypeOfFruit());;
		Assert.assertEquals("There should be 5 apples on the tree", 5);
	}
	 
	@Test
	public void can_pick_fruit() {
		// Arrange
		
		
		// Act
		boolean fruitPicked = tree.PickFruit(3);
		
		// Assert
		Assert.assertTrue("We should be able to pick 3 apples", fruitPicked);
		Assert.assertEquals("There should be 2 pieces of fruit left", 2, tree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void can_not_pick_too_much_fruit() {
		
		// no arrange
		
		//
		boolean fruitPicked = tree.PickFruit(10);
		
		// Assert
		Assert.assertFalse("Should not be able to pick more fruit than there is on the tree", fruitPicked);
		Assert.assertEquals("There should still be 5 apples if we didnt pick any",5,tree.getPiecesOfFruitLeft());
	}
}
