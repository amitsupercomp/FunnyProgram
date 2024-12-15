package com.aks.twopointer;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String...");
		boolean result = palindromeCheck(sc.next());
		if (result)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
		sc.close();
	}
	
	private static boolean palindromeCheck(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i++) != str.charAt(j--))
				return false;
		}
		return true;
	}

}
