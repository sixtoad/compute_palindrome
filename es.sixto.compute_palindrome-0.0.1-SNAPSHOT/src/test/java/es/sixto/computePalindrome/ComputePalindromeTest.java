package es.sixto.computePalindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputePalindromeTest {

	@Test
	public void testIsPalindromo() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		boolean result = validatePalindrome.isPalindrome(121);
		assertEquals(true, result);
	}

	@Test
	public void testIsPalindromoFail() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		boolean result = validatePalindrome.isPalindrome(195);
		assertEquals(false, result);
	}
	
	@Test
	public void testComputePalindromeOK() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		int result = validatePalindrome.computePalindrome(195);
		assertEquals(9339, result);
	}
	
	@Test
	public void testComputePalindromeStringOK() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		String result = validatePalindrome.computePalindrome("195");
		assertEquals("9339", result);
	}

}
