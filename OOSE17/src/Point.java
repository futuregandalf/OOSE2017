package Blatt4;

public class Point {
	int x,y;
	
	public Point(int a, int b){
	
		x = a;
		y = b;
		
	}
	
	public static double distance(Point a, Point b){
		
		double d;
		
		d = Math.sqrt(Math.pow((a.y)-(b.y), 2)+Math.pow((a.x)-(b.x), 2));
		
		
		System.out.println(d);
		return  d;
		
	}
	
	public static void ausgabe(Point a, Point b){
		
		System.out.println("Die Koordinaten sind a:(" +a.x +"|"+a.y +") und b:("+b.x +"|"+b.y+")");
			
	}
	
	public static void main(String[] args)
	{
		Point a = new Point(12,13);
		Point b = new Point(15,16);
		distance (a,b);
		ausgabe (a,b);
		
	}
	
	
	
}
