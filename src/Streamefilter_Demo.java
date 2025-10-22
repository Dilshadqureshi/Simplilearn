import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamefilter_Demo 
{

public static void main(String []args) {
	
	List<Integer>numberList=new ArrayList<>();
	numberList.add(10);
	numberList.add(20);
	numberList.add(30);
	numberList.add(40);
	
	
	List<String> languages=new ArrayList<String>();
	languages.add("Java");
	languages.add("Php");
	languages.add("Python");
	
	
	//List<String>filterResult=new ArrayList<String>();
	//for(String s:languages){
	//	if(s.startsWith("p")) {
	//		filterResult.add(s);
	//	}
	//}
	
	List<Integer>squareList=numberList.stream().map(x -> x*x).collect(Collectors.toList());
	System.out.println("List of square numbers :"+ squareList);
	
	//System.out.println("Laguages start with 'p' "+filterResult);
}
}
