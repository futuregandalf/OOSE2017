package Blatt2;

public class TrafficOffice {
	private static Car[] cars = new Car[100];
	
	public static void registerCar(Car c){
		
		for (int i = 0; i<100; i++){
			if (cars[i] == null){
				cars[i] = c;
				return;
			}
		}
	}
	
	public static Car getCar(String licensePlate){
		for (int i = 0; i<100; i++){
			if (cars[i].getLicensePlate().equals(licensePlate)){
				return cars[i];
			}
		}
		return null;
	}


}
