package aks.fun1.com;

import java.util.*;

public class CharDemo {
	
	public static void main(String[] args) {
		
//		char c = '1';
//		int i = 1;
//		
//		System.out.println((char)(i + '0'));
		
		String str = "weererrururutututmnmnbcgfdpncvr";
		Map<Character, Integer> map = new HashMap<>();
		Set<Character> res = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), 1);
			else
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			if (map.get(str.charAt(i)) >= 3)
				res.add(str.charAt(i));
		}
		System.out.println(map);
		System.out.println(res);
		Integer a = 1;
		Integer b = 1;
		Integer x = 128;
		Integer y = 128;
		System.out.println(a==b);
		System.out.println(x==y);
		
		String str1 = "ajay singh rathaur";
		int first = str1.indexOf('a');
		int last = str1.lastIndexOf('a');
		System.out.println("First  ::  " + first);
		System.out.println("Last  ::  " + last);
		System.out.println("Character between :: " + (first - last));
		
	}

}
