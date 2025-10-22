
public class Abstract_Demo 
{
public static void main (String []args) {
	Abstract_GraphicObject circle= new Abstract_Circle();
	circle.draw();
	circle.reSize();
	
	Abstract_Retangle rectangle=new Abstract_Retangle();
	rectangle.draw();
	rectangle.reSize();
}
}
