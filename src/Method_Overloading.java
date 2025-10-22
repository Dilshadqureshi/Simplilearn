
public class Method_Overloading
{
public int multiply(int x,int y) {
	return (x*y);
	
}

public int multiply(int x,int y,int z) {
	return (x*y*z);
}
public double multiply(double x,double y) {
	return(x*y);
}
public static void main(String []args) {
	Method_Overloading mo= new Method_Overloading();
	System.out.println(mo.multiply(10, 20));
	System.out.println(mo.multiply(10, 20, 30));
	System.out.println(mo.multiply(20.5, 30.5));

}
}
