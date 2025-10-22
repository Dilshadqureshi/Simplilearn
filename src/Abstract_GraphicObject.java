
public abstract class Abstract_GraphicObject
{
int x,y;

void MoveTo(int newX,int newY){
	System.out.println("move to x :"+x+" and y:"+y);
}

abstract void draw();
abstract void reSize();
}
