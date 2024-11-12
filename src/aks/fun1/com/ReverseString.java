package aks.fun1.com;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println("You have entered  ::  " + str);
		System.out.println("Reverse of the Whole String ::  " + reverseStringOnly(str));
		System.out.println("Through recursion ::  " + revRec(str));
		System.out.println("Reverse individiual  ::  " + reverseIndividualString(str));
	}
	
	public static String reverseStringOnly(String str) {
		StringBuffer res = new StringBuffer();
		for (int i = str.length() - 1; i > -1; i--) {
			res.append(str.charAt(i));
		}
		return res.toString();
	}
	
	public static String reverseIndividualString(String str) {
		StringBuffer res = new StringBuffer();
		String[] strArr = str.split("[ ]+");
		for (int i = 0; i < strArr.length; i++) {
			
			res.append(revRec(strArr[i]));
		}
		return res.toString();
	}
	
	public static String revRec(String str) {
		if (str.length() == 0)
			return " ";
		return revRec(str.substring(1))+ str.charAt(0);
	}

}
