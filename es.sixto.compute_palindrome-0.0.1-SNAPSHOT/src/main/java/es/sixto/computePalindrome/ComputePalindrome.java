/**
 * 
 */
package es.sixto.computePalindrome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

	public boolean isPalindrome(long intToValidate) {
		long reversed = reverseNumber(intToValidate);
		return intToValidate==reversed;
	}

	private long reverseNumber(long intToValidate) {
		long reversed = 0;
		long rest = 0;
		long tempNumber = intToValidate;
		while (tempNumber>0) {
			rest = tempNumber%10;
			reversed = reversed*10+rest;
			tempNumber = tempNumber/10;
		}
		return reversed;
	}

	public long computePalindrome(long numberToCompute) {
		if (!this.isPalindrome(numberToCompute)) {
			iterations++;
			if (iterations>1000) {
				return -1;
			}
			System.out.println(iterations+" "+numberToCompute);
			return computePalindrome(numberToCompute+reverseNumber(numberToCompute));
		}
		return numberToCompute;
	}
	

	public String computePalindrome(String numberToCompute) {
		iterations=0;
		int number = Integer.parseInt(numberToCompute);
		long result = this.computePalindrome(number);
		return iterations+" "+result;
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
