import java.util.ArrayList;
import java.util.List;

public class ExceptionTryCatch
{
	public void writeList() {
	
try {
	
	List<Integer>list= new ArrayList<>();
	list.add(49);
	System.out.println("Eneteger "+"try statment");
	Integer a =list.get(0);
	System.out.println("Accessing the first element :"+a);
}
catch(IndexOutOfBoundsException e) {
	System.out.println("coughth indexOutOfBondException :"+e.getMessage());
	
}
finally {
	System.out.println("this will always be executed");
}
	
	
}

}