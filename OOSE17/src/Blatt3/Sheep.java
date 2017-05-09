package Blatt3;

public class Sheep {
	private String name;
	public Fur fur;
	
	public Sheep(String name, Fur fur) {
		this.name = name;
		this.fur = fur;
	}
	
	public void shear() {
		fur.length = 0;
	}
	
	public String toString() {
		return "Name: " + name + " " + fur.toString();
	}
	
	public Sheep clone() {
		return this;
	}
	
	public Sheep shallowclone(){ //Kopieren per Verweis
		return this;
	}
	
	public Sheep deepclone(){ //Kopieren per Inhaltskopien
		return new Sheep(name, new Fur (fur.length));
	}
	
	public boolean equals(Sheep s){ //Prüfen ob das Sheep-Objekt mit einem anderen identisch ist, alle Instanzvariablen sind gleich
		if (s instanceof Sheep){
			return (name == s.name && fur.length == s.fur.length) ? true : false; // wenn name und felllänge identisch sind, dann gebe true zurück, sonst false
		}else{
			System.out.println("Fehler"); // Wenn s keine Instanz des Typen Sheep ist, dann gebe Fehler aus und gebe ein False zurück
			return false;
		}
	}
}
