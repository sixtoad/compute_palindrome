package es.sixto.computePalindrome;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;


public class ComputePalindromeTest {

	@Test
	public void testIsPalindrome() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		boolean result = validatePalindrome.isPalindrome(new BigInteger("121"));
		assertEquals(true, result);
	}

	@Test
	public void testIsPalindromeFail() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		boolean result = validatePalindrome.isPalindrome(new BigInteger("195"));
		assertEquals(false, result);
	}
	
	@Test
	public void testComputePalindromeOK() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		BigInteger result = validatePalindrome.computePalindrome(new BigInteger("195"));
		assertEquals(new BigInteger("9339"), result);
	}
	
	@Test
	public void testComputePalindromeStringOK() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		String result = validatePalindrome.computePalindrome("195");
		assertEquals("4 9339", result);
		result = validatePalindrome.computePalindrome("121");
		assertEquals("0 121", result);
	}
	
	@Test
	public void testComputePalindromeStringFromFileOK() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		String filePath = "./src/test/resources/simplePalindromeOK";
		String[] result = validatePalindrome.computePalindromeFromFile(filePath);
		assertEquals("4 9339", result[0]);
	}
	
	@Test
	public void testComputePalindromeStringFromFileComplexOK() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		String filePath = "./src/test/resources/complexPalindromeOK";
		String[] result = validatePalindrome.computePalindromeFromFile(filePath);
		assertEquals("1 11", result[0]);
		assertEquals("4 9339", result[1]);
		assertEquals("2 121", result[2]);
		assertEquals("24 8813200023188", result[3]);
		assertEquals("23 8813200023188", result[4]);
		assertEquals("1001 -1", result[5]);
	}
	
	@Test
	public void testMainMehodOK () {
		String pathToFile = "./src/test/resources/complexPalindromeOK";
		ComputePalindrome validator = new ComputePalindrome();
		String[] args = new String[1];
		args[0] = pathToFile;
		String result = validator.run(args);
		StringBuffer expected = new StringBuffer();
		expected.append("1 11\n");
		expected.append("4 9339\n");
		expected.append("2 121\n");
		expected.append("24 8813200023188\n");
		expected.append("23 8813200023188\n");
		expected.append("1001 -1\n");
		assertEquals("Must be valid", expected.toString(), result);
	}
}
