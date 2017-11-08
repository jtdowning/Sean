package com.techelevator;

public class KataFizzBuzz {

		
		public String fizzBuzz(int number) {
			if(shouldFizz (number) && shouldBuzz (number)){
				return "fizz buzz";
			} else if (shouldFizz(number)) {
				return "fizz";	
			} else if (shouldBuzz(number)) {
				return "buzz";
			} else {
			return Integer.toString(number);
			}
		}
		
		private boolean shouldFizz(int number) {
			return number % 3 == 0 || Integer.toString(number).contains("3");
		}
		
		private boolean shouldBuzz(int number) {
			return number % 5 == 0 || toString().contains("5");
			
		}
		
	}

