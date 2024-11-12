package DuplicateString;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String string = "Amit Kumar Srivastava Kumar Amit";
		String[] atr = string.split(" ");
		
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < atr.length; i++) {
			if (!map.containsKey(atr[i])) {
				map.put(atr[i], 1);
			} else {
				map.put(atr[i], map.get(atr[i]) + 1);
			}
		}
		System.out.println(map);
	}
}
