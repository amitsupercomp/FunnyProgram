package aks.fun1.com;

public class RepeatativeAddition {

	public static void main(String[] args) {
		int n = 1234567;
		System.out.println(singleDigit(n));
	}

	public static int singleDigit(int n) {
		// code here
		int res = 0; 
		boolean flag = false;
		do {
			if (flag) {
				n = res;
				res = 0;
			}
			while (n > 0) {
				int temp = n / 10;
				res += temp;
				n = n / 10;
			}
			if (res > 9)
				flag = true;
		} while (res > 9);
		return res;
	}

}
