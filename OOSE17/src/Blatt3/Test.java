package Blatt3;

public class Test {
	public static void main (String[] args) {
		C1 a=new C2();
		C2 b=new C2();
		
		((C2) a).f1();
		((C1) b).f1();	
		System.out.println(a.s);
		b.f1();
		b.f2();
		b.f3();
		//C1 c = new C1(); c.f3(); c.f3() FEHLER! f3 ist nicht in C1 enthalten, wird bei C2 als Erweiterung implementiert
		C1 c = new C1(); ((C2) c).f1();
		
		}
	
}
