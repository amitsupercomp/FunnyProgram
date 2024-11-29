package aks.fun1.com;

import java.util.*;

public class HCLTech {
	
	public static void main(String[] args) {
		System.out.println(getResult("EMHMHH", "EEHHMH"));
	}
	
	private static String getResult(String eric, String bob) {

		Map<Character, Integer> map = new HashMap<>();
		map.put('E', 2);
		map.put('M', 3);
		map.put('H', 5);
		
		int totalE = 0, totalB = 0;
		
		for (int i = 0; i < eric.length(); i++) {
			if (map.containsKey(eric.charAt(i)))
				totalE += map.get(eric.charAt(i));
			if (map.containsKey(bob.charAt(i)))
				totalB += map.get(bob.charAt(i));
		}
		
		if (totalB > totalE)
			return "Bob";
		else if (totalE > totalB)
			return "Eric";
		else
			return "Tie";
		
	}

}
