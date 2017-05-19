
public class Point3D extends Point {
	int z;

	public Point3D( int a, int b, int c) {
		super(a,b);
		z = c;
	}
	
public static double distance(Point3D a, Point3D b){
	
		Point3D v = new Point3D(0,0,0);
		double d;
		
	    v.x = b.x - a.x;
		v.y = b.y - a.y;
		v.z = b.z - a.z;
		
		
		d = Math.sqrt(Math.pow(v.x, 2)+Math.pow(v.y, 2)+Math.pow(v.z, 2));
		
		System.out.println(d);
		return d;
		
	}

public static void ausgabe(Point3D a, Point3D b){
	
	System.out.println("Die Koordinaten sind a:(" +a.x +"|"+a.y +"|"+a.z +") und b:("+b.x +"|"+b.y+"|"+b.z+")");
		
}

	public static void main(String[] args){
		
		Point3D a = new Point3D(40,13,7);
		Point3D b = new Point3D(1,-3,0);
		distance (a,b);
		ausgabe (a,b);
	}
}
