package es.sixto.computePalindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputePalindromeTest {

	@Test
	public void testIsPalindromo() {
		ComputePalindrome validatePalindrome = new ComputePalindrome();
		boolean result = validatePalindrome.isPalindrome(121);
	}


}
