package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {

	private KataPotter books;
	
	@Before
	public void setup() {
		books = new KataPotter();
	}

	@Test
	public void this_should_return_book_1() {
		KataPotter books =  new KataPotter();
		
		Assert.assertEquals("this should return a book at $8", 8,  books);
		
	}
	@Test
	public void this_should_return_two_copies_of_same_book() {
		KataPotter books =  new KataPotter();
		Assert.assertEquals("this should return two books that are the same for $16", 16, books);
		
	}
	@Test
	public void this_should_return_three_copies_of_same_book() {
		KataPotter books =  new KataPotter();
		Assert.assertEquals("this should return three books that are the same for $24", 24, books);
	}
	@Test
	public void this_should_return_four_copies_of_the_same_book() {
		KataPotter books =  new KataPotter();
		Assert.assertEquals("this should return four books that are the same for $32", 32, books);
	}
	
	@Test
	public void this_should_return_five_copies_of_the_same_book() {
		KataPotter books =  new KataPotter();
		Assert.assertEquals("this should return five books that are the same for $40", 40, books);
		
	}
	@Test
	public void this_should_return_five_different_books_with_a_25_percent_discount() {
		KataPotter books = new KataPotter();
		Assert.assertEquals("this should return five different books with a 25% discount",30,books);
	}
	@Test
	public void this_should_return_four_different_books_with_a_20_percent_discount() {
		KataPotter books = new KataPotter();
		Assert.assertEquals("this should return four different books with a 20% discount",25.60, books );
	}
	@Test
	public void this_should_return_three_different_books_with_a_15_percent_discount() {
		KataPotter books = new KataPotter();
		Assert.assertEquals("this should return three different books with a 15% discount", 20.40, books);
	}
	@Test
	public void this_should_return_two_different_books_with_a_10_precent_discount() {
		KataPotter books = new KataPotter();
		Assert.assertEquals("this should return two different books with a 10% discount",14.40, books);
		
	}
	@Test
	public void this_should_return_five_books_with_four_of_them_the_same() {
		KataPotter books = new KataPotter();
		Assert.assertEquals("this shoiuld return 5 books which 3 are different and 2 are the same",  36.40, books);
	}
	@Test
	public void this_should_return_four_books_with_three_of_them_the_same() {
		KataPotter books = new KataPotter();
		Assert.assertEquals("this shoudl return 4 books which three of them are the same and q isnt", 33.44, books);
	}
}

