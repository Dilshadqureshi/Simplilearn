
public class Cuboid
{
int width;
int height;
int depth;

Cuboid(int width,int height,int depth){
	this.width=width;
	this.height=height;
	this.depth=depth;
	}
Cuboid(int width,int height){
this.width=width;
this.height=height;
this.depth=10;
}
Cuboid(int dimention){
	width=dimention;
	height=dimention;
	depth=dimention;
}
Cuboid(){
	this.width=10;
	this.height=10;
	this.depth=10;
}

int volume() {
	return width* height* depth;
}

public static void main(String []args) {
	int volume;
	Cuboid stdcuboid= new Cuboid(10,20,15);
	volume=stdcuboid.volume();
	System.out.println("volume of single cuboid:"+volume);
	
	Cuboid cuboidWithDefaults= new Cuboid(10,20);
	volume=cuboidWithDefaults.volume();
	System.out.println("volume of cuboid with defaults depth is:"+volume);
	
	Cuboid cube= new Cuboid(10);
	volume=cube.volume();
	System.out.println("volume of cube is:"+ volume );
	
	Cuboid defaultscubid=new Cuboid();
	volume=defaultscubid.volume();
	System.out.println("volume defualt cubid:"+volume);
	
	
}






}
