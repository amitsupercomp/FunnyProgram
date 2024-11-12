package DuplicateString;

import java.util.HashMap;

public class Main2 {
	public static void main(String[] args) {
		String string = "Amit Kumar Srivastava Kumar Amit";
		String[] atr = string.split(" ");
		
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < atr.length; i++) {
			map.put(atr[i], map.getOrDefault((atr[i]), 0) + 1);
		}
		System.out.println(map);
	}
}
