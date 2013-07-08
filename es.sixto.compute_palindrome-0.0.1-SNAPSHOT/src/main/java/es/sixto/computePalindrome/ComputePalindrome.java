/**
 * 
 */
package es.sixto.computePalindrome;

/**
 * @author Sixto
 *
 */
public class ComputePalindrome {
	
	public int iterations = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(int intToValidate) {
		int reversed = reverseNumber(intToValidate);
		return intToValidate==reversed;
	}

	private int reverseNumber(int intToValidate) {
		int reversed = 0;
		int rest = 0;
		int tempNumber = intToValidate;
		while (tempNumber>0) {
			rest = tempNumber%10;
			reversed = reversed*10+rest;
			tempNumber = tempNumber/10;
		}
		return reversed;
	}

	public int computePalindrome(int numberToCompute) {
		if (!this.isPalindrome(numberToCompute)) {
			iterations++;
			return computePalindrome(numberToCompute+reverseNumber(numberToCompute));
		}
		return numberToCompute;
	}
	

	public String computePalindrome(String numberToCompute) {
		int number = Integer.parseInt(numberToCompute);
		int result = this.computePalindrome(number);
		return iterations+" "+result;
	}

	public String[] computePalindromeFromFile(String filePath) {
		// TODO Auto-generated method stub
		return null;
	}

}
