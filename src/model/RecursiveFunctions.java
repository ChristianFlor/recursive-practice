package model;

public class RecursiveFunctions {
	

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
	
	public static String shuffle(String s1, String s2, int n) {
		String fin="";
		if(s1.length() >n) {
			fin = s1.charAt(n)+s2.charAt(n)+shuffle(s1,s2,n);
		}
		return fin;		
	}
	
	public static boolean palindrome(String s) {
		return true;
	}
	
	public boolean isPal(String p, int n) {
		if(n < p.length()) {
			if(p.charAt(n) != p.charAt(p.length()-1-n)) {
				return false;
			} else {
				return isPal(p, n+1);
			}
		}
		return true;
	}
	
	public String revert(String r, int n) {
		if(n < r.length()) {
			return r.charAt(r.length()-1-n) + revert(r, n+1);
		}
		return "";
	}

	
}
