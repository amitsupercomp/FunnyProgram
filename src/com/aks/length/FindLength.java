package com.aks.length;

import java.util.Scanner;

public class FindLength {
	
	static {
		System.out.println("This program to calculate length of the string without using length method...");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to calculate length");
		StringBuffer str = new StringBuffer(sc.next());
		str.append('a');
		int maxLimit = str.lastIndexOf("a");
		
		System.out.println("Length of the string is :: " + (maxLimit));
		
		
	}

}
