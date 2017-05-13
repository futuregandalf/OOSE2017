package Blatt3;

public class Test {
	public static void main (String[] args) {
		C1 a=new C2();
		C2 b=new C2();
		
		((C2) a).f1();
		((C1) b).f1();	
		System.out.println(a.s);
		b.f1(); // Gibt C1::f1 aus, weil die Funktion f1() die Funktion f1() von C1 überschreibt
		b.f2(); //Gibt C1::f1 aus, weil C2 die Funktion f2() von C1 erbt und nicht überschreibt
		b.f3(); //Gibt C2::f3 aus, weil C2 f3() als erweiterte Methode besitzt
		//C1 c = new C1(); c.f3(); c.f3() FEHLER! f3 ist nicht in C1 enthalten, wird bei C2 als Erweiterung implementiert
		//C1 c = new C1(); ((C2) c).f1(); //C1 kann nicht in C2 typcastet werden
		
		}
	
}
