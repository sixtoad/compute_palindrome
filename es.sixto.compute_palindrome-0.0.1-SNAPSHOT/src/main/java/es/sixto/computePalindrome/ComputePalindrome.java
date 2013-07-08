/**
 * 
 */
package es.sixto.computePalindrome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

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

	public boolean isPalindrome(BigInteger intToValidate) {
		BigInteger reversed = reverseNumber(intToValidate);
		return intToValidate.compareTo(reversed)==0;
	}

	private BigInteger reverseNumber(BigInteger intToValidate) {
		BigInteger reversed = BigInteger.ZERO;
		BigInteger rest = BigInteger.ZERO;
		BigInteger tempNumber = intToValidate;
		while (tempNumber.compareTo(BigInteger.ZERO)>0) {
			rest = tempNumber.mod(new BigInteger("10"));
			reversed = reversed.multiply(new BigInteger("10")).add(rest);
			tempNumber = tempNumber.divide(new BigInteger("10"));
		}
		return reversed;
	}

	public BigInteger computePalindrome(BigInteger numberToCompute) {
		if (!this.isPalindrome(numberToCompute)) {
			iterations++;
			if (iterations>1000) {
				return new BigInteger("-1");
			}
			return computePalindrome(numberToCompute.add(reverseNumber(numberToCompute)));
		}
		return numberToCompute;
	}
	

	public String computePalindrome(String numberToCompute) {
		iterations=0;
		BigInteger number = new BigInteger(numberToCompute);
		BigInteger result = this.computePalindrome(number);
		return iterations+" "+result.toString();
	}

	public String[] computePalindromeFromFile(String pathToFile) {
		BufferedReader br = null;
		ArrayList<String> processesLines = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader(pathToFile));
			String line = br.readLine();
			while (line != null) {
				processesLines.add(this.computePalindrome(line));
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			processesLines.add("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br!=null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return processesLines.toArray(new String[processesLines.size()]);
	}

}
