package Blatt2;

public class Car {
	
	private Delict[] delicts = new Delict[5];
	private String licensePlate;
	private String owner;
	private String address;
	
	public Car(String licensePlate, String owner, String address){
		this.licensePlate = licensePlate;
		this.owner = owner;
		this.address = address;
	}
	
	public void registerDelict(Delict del){
		for (int i = 0; i<5; i++){
			if (delicts[i] == null){
				delicts[i] = del;
				return;
			}
		}
	}
	
	public void printDelicts(){
		for(int i = 0; i<5; i++){
			if (delicts[i] != null){
				System.out.println("Punkte: "+ delicts[i].getPoints() + " Gebühren:" + delicts[i].getFees());
			}
		}
	}
	
	public String getLicensePlate(){
		return this.licensePlate;
	}
	
	public String getOwner(){
		return this.owner;
	}
	
	public String getAddress(){
		return this.address;
	}
}
