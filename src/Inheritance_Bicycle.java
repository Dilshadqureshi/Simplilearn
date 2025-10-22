
public class Inheritance_Bicycle 
{
protected int gear;
protected int speed;


public Inheritance_Bicycle(int startSpeed,int startGear) {
	speed=startSpeed;
	gear=startGear;

}

public void setGear(int newvalue) {
	
	gear=newvalue;
}

public void applyBrake(int decrement) {
	speed-=decrement;
}

public void speedUp(int increment) {
	speed+=increment;
}
}
