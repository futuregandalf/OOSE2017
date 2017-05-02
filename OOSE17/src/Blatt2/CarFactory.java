package Blatt2;
import java.util.Random;

public class CarFactory {
	
	public static void main(String[] args) {
		buildCar("asfasf", "asdasd");
	}
	public static Car buildCar(String owner, String owneraddress){
		Random rand = new Random();
		String a = Integer.toString(rand.nextInt((9999 - 1) + 1) + 1);
		return new Car((randomString(3,1) + "-" + randomString(2,1) + " " + a), owner, owneraddress);
	}
	
	private static String randomString(int max, int min) {
		
		Random rnd = new Random(); 
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < rnd.nextInt((max - min) + min) + 1; i++) {
		sb.append((char)((rnd.nextInt(25)+65)));
		}
		return sb.toString();
		}

}
