
public class Interface_Demo
{
public static void main (String[]args) {
	Interface_MountainBike moun=new Interface_MountainBike(20,10,1);
	System.out.println("Gear is :"+ moun.getGear());
	System.out.println("Seat height is "+moun.getSeatHeight());
	System.out.println("Bike speed Is :"+moun.getSpeed());
	
	moun.applyBrake(1);
	System.out.println("Bike speed after applying break is:"+moun.getSpeed());
	
	moun.speedUp(10);
	System.out.println("Bike is new speed after increment is:"+moun.getSpeed());
	
}
}
