package Blatt3;

public class Main {
	public static void main(String[] args) {
		Sheep schaf1;
		Sheep schaf2;
		schaf1 = new Sheep("Francois", new Fur(10));
		schaf2 = schaf1.clone();
		
		//Erste Ausgabe
		System.out.println(schaf1.toString());
		System.out.println(schaf2.toString());
		
		//Behandlung des 2. Schaafes
		schaf2.shear();
		
		//Zweite Ausgabe
		System.out.println(schaf1.toString());
		System.out.println(schaf2.toString());
		
		// Begründung: Das zweite Schaf hat die Adresse das ersten Schafobjektes durch die Klone-Methode überreicht bekommen.
		// Somit ist es das selbe Objekt, alle Änderungen am zweiten Schaf betreffen auch das ersten und andersrum. Beide haben
		// nämlich die selbe Adresse im Speicher!
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		//-------------------------------------------------------------------------------------------------------------------------//
		
		Sheep schaf3;
		Sheep schaf4;
		schaf3 = new Sheep("Francois_new", new Fur(55));
		schaf4 = schaf3.deepclone();
		
		//Erste Ausgabe
		System.out.println(schaf3.toString());
		System.out.println(schaf4.toString());
		
		//Behandlung des 2. Schaafes
		schaf4.shear();
				
		//Zweite Ausgabe
		System.out.println(schaf3.toString());
		System.out.println(schaf4.toString());
		
		//Shallow-Kopie = Referenz, Deep-Kopie = neue Instanz mit kopierten Werten
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		Sheep schaf5;
		Sheep schaf6;
		schaf5 = new Sheep("Francois_1", new Fur (55));
		schaf6 = new Sheep("Francois_1", new Fur (55));
		
		System.out.println((schaf5.equals(schaf6)) ? "Schafe sind identisch" : "Schafe sind nicht identisch");
		
		//Aufgabe 1d) Cloneable Interface stellt die Clone-Methode, die es erlaubt eine Shallow-Kopie durchzuführen (Siehe oben)
		// Die Clone-Methode kann überschrieben werden
		
		//Aufgabe2  a) Vermutung: "Blumenkohl an Gorgonzolasoße" und "Spaghetti Bologneser Art"
		//			b) Beide Klassen (Cauliflower und Spaghetti) haben das Interface Food als Implement. Das Interface ist eine Erweiterung der Klasse selbst und zwingt den User eine Methode namens
					//getMeal() zu implementieren, schreiben....
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		Food don;
		don = new Doener("Cocktailsoße", "Lammfleisch"); //Neuen Döner erstellen
		System.out.println(don.getMeal()); // Gibt die "Dönereigenschaften" aus
		don = new Spaghetti(); // Weißt dem Food-Objekt eine neue Klasse zu
		System.out.println(don.getMeal()); // Gibt Spaghetti aus
		
		/*
		 1. ((C2) a).f1();                     Vermutung: C2::f1
		 2. ((C1) b).f1();					   Vermutung: C2::f1
		 3. System.out.println(a.s);		   Vermutung : 2
		 4. b.f1();							   Vermutung : C2::f1	
		 5. b.f2();							   Vermutung : C1::f2
		 6. b.f3();							   Vermutung: C2::f3
		 7. C1 c = new C1(); c.f3();		   Vermutung: c.f3() FEHLER! f3 ist nicht in C1 enthalten, wird bei C2 als Erweiterung implementiert
		 8. C1 c = new C1(); ((C2) c).f1();    Vermutung: C1::f1  Frage: Typecasten ersetzt gleichnamige Methoden oder nicht?!
		 */
	}
}
