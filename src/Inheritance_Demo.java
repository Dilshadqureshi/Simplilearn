
public class Inheritance_Demo 
{
public static void main(String []args) {
	Inheritance_MountainBike mountainBike=new Inheritance_MountainBike(20,10,1);
	System.out.println("Gear Is:"+mountainBike.gear);
	System.out.println("Seat Height is:"+mountainBike.seatHeight);
	System.out.println("Bike Speed is:"+mountainBike.speed);
	
	mountainBike.applyBrake(1);
	System.out.println("Bike speed after applying break is:"+mountainBike.speed);
}
}
