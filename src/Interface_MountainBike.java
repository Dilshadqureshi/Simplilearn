
public class Interface_MountainBike implements Bicycle{

	private int seatHeight;
	private int gear;
	private int speed;
	
	
	public Interface_MountainBike(int startHeight,int startGear,int speedStart) {
		seatHeight=startHeight;
		gear=startGear;
		speed=speedStart;
	}
	
	
	
	@Override
	public void applyBrake(int dencrement) {
		speed=speed-dencrement;
	}

	@Override
	public void speedUp(int increment) {
		speed=speed+increment;
	}



	public int getGear() {
		return gear;
	}



	public void setGear(int gear) {
		this.gear = gear;
	}



	public int getSeatHeight() {
		return seatHeight;
	}



	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}
