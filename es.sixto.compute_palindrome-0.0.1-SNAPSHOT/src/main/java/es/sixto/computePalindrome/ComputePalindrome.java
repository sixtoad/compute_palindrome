/**
 * 
 */
package es.sixto.computePalindrome;

/**
 * @author Sixto
 *
 */
public class ComputePalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(int intToValidate) {
		int reversed = 0;
		int rest = 0;
		int tempNumber = intToValidate;
		while (tempNumber>0) {
			rest = tempNumber%10;
			reversed = reversed*10+rest;
			tempNumber = tempNumber/10;
		}
		return intToValidate==reversed;
	}

	public int computePalindrome(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
