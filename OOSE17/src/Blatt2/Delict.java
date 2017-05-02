package Blatt2;

public class Delict {
	private int points = 0;
	private double fees = 0;
	
	public Delict(int points, double fees){
		this.points = points;
		this.fees = fees;
	}
	
	public int getPoints(){
		return this.points;
	}
	
	public double getFees(){
		return this.fees;
	}
}
