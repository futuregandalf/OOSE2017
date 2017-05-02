package Blatt2;

public class Aufgabe1 {

	public static void main(String[] args) {
		//Aufgabe 1a)
		System.out.println("Aufgabe 1a:");
		System.out.println("-------------------");
		long a;
		for (int i = 1; i<20; i++){
			a = fakultaet(i);
			System.out.println(a);
		}
		System.out.println("-------------------");
		
		//Aufgabe 1b)
		System.out.println("\nAufgabe 1b:");
		System.out.println("-------------------");
		long b;
		b = binomialkoeffizient(0,0);
		System.out.println(b);
		System.out.println("-------------------");
		
		//Aufgabe 1c)
		System.out.println("\nAufgabe 1c:");
		System.out.println("-------------------");
		long c;
		c = lotto(3,3);
		System.out.println(c);
		System.out.println("-------------------");
	}
	
	//Aufgabe 1a)
	private static long fakultaet(long n){
		if (n == 1){
			return n;
		}else{
			return n*fakultaet(n-1);
		}
	}
	
	//Aufgabe 1b)
	public static long binomialkoeffizient(long n, long k){
		if (k ==n){
			return 1;
		}else if (k>=0 && k<=n){
			return (fakultaet(n)/(fakultaet(k)*fakultaet(n-k)));
		}else{
			return 0;
		}
	}
	
	//Aufgabe 1c)
	public static long lotto(long n, long k){
		return binomialkoeffizient(n, k) * fakultaet(k);
	}
	
	

}
