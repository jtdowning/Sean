package com.techelevator;
import java.util.HashMap;
import java.util.Map;

public class KataRomanNumeralToNumber {
	
	Map<String, Integer> romanNumeralToNumbers;
	
	public KataRomanNumeralToNumber() {
		romanNumeralToNumbers = new HashMap<String, Integer>();
		
		romanNumeralToNumbers.put("I", 1);
		romanNumeralToNumbers.put("II", 2);
		romanNumeralToNumbers.put("III", 3);
		romanNumeralToNumbers.put("IV", 4);
		romanNumeralToNumbers.put("V", 5);
		romanNumeralToNumbers.put("VI", 6);
		romanNumeralToNumbers.put("VII", 7);
		romanNumeralToNumbers.put("VIII", 8);
		romanNumeralToNumbers.put("IX", 9);
		romanNumeralToNumbers.put("X", 10);
		
		romanNumeralToNumbers.put("XL", 40);
		romanNumeralToNumbers.put("L", 50);
		romanNumeralToNumbers.put("XC", 90);
		romanNumeralToNumbers.put("C", 100);
		
		romanNumeralToNumbers.put("CD", 400);
		romanNumeralToNumbers.put("D", 500);
		romanNumeralToNumbers.put("CM", 900);
		romanNumeralToNumbers.put("M", 1000);
	}
	
	public int convertRomanNumeralToNumber(String romanNumeral) {
		int convertedSum = 0;
		
		if (romanNumeral.contains("CM")) {
			convertedSum += 900;
			romanNumeral = romanNumeral.replace("CM", "");
		}
		
		if (romanNumeral.contains("CD")) {
			convertedSum += 400;
			romanNumeral = romanNumeral.replace("CD", "");
		}
		
		if (romanNumeral.contains("XC")) {
			convertedSum += 90;
			romanNumeral = romanNumeral.replace("XC", "");
		}
		
		if (romanNumeral.contains("XL")) {
			convertedSum += 40;
			romanNumeral = romanNumeral.replace("XL", "");
		}
		
		
		String[] romanNumeralSplit = romanNumeral.split("");
		
		for (String numeral : romanNumeralSplit) {
			convertedSum += romanNumeralToNumbers.get(numeral);
	
		}
		
		return convertedSum;
	}

}
