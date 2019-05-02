package model;

public class RecursiveFunctions {
	
	public RecursiveFunctions() {
		
	}
	
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
	public static int fibonacci(int n) {
		if(n==1) {
			return 1;
		}else if(n==0) {
			return 0;
		}else {
			return fibonacci(n-1) + fibonacci(n-2) ;
		}
	}
	
	public static int arraySummatory(int[] a, int pos) {
		if(pos==0) {
			return a[0];
		}else {
			return a[pos]+arraySummatory(a, pos-1);
		}
		
	}
	
}
