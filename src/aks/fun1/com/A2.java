package aks.fun1.com;

public class A2 {
	
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Hi");
		data((String)null);
	}
	
	public static void data(Object o) {
		System.out.println("Object");
	}
	
	public static void data(String o) {
		System.out.println("String");
	}
	
	public static void data(StringBuilder o) {
		System.out.println("StringBuilder");
	}

}
