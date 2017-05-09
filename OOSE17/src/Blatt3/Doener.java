package Blatt3;

public class Doener implements Food {
	
	private String sosse;
	private String fleisch;
	
	public Doener(String so, String fl){
		sosse = so;
		fleisch = fl;
	}
	
	public String getMeal(){
		return "Doener mit " + sosse + " und " + fleisch;
	}
}
