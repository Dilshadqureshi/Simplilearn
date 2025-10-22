import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream_Demo 
{
public static void main(String[]args) {
	List<Integer>numberList= new ArrayList<Integer>();
	numberList.add(10);
	numberList.add(20);
	numberList.add(30);
	numberList.add(40);
	
	
	//List<Integer> squareList=new ArrayList<Integer>();
	//for(Integer i:numberList) {
	//	squareList.add(i*i);
	//}
	
	List<Integer>squareList=numberList.stream().map(x -> x*x).collect(Collectors.toList());
	System.out.println("List of square numbers :"+ squareList);
	
	
	
	
	
	//Set<Integer>	squareSet=new HashSet<>();
	//for(Integer i:numberList) {
	//	squareList.add(i*i);
	//}
}
}
