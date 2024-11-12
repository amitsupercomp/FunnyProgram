package fun1;

public class LongestSubstringWithoutRepeatingChar {
	
	public static void main(String[] args) {
		 String str = "";
		 String s = "aa";
	        int res = 0;
//	        if (s.length() <= 1)
//	            return s.length();
	        for (int i = 1; i < s.length(); i++) {
	            if (str.indexOf(s.charAt(i)) == -1)
	                str += s.charAt(i);
	            else {
	                if (res < str.length())
	                    res = str.length();
	                i--;
	                str = "";
	            }
	            res = str.length();
	        }
	        System.out.println(res);
	}

}
