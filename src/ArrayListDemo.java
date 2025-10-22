import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo 
{
public static void main(String []args) {
	List<Integer> arrayList=new ArrayList<>(5);
	
	for(int i=1;i<=5;i++) {
		arrayList.add(i);
	}
		System.out.println(arrayList);
		
		arrayList.remove(3);
		
		System.out.println(arrayList);
		
		//for(int i1=0;i1< arrayList.size();i1++)
		//{
		//	System.out.print(arrayList.get(i1)+" ");
	//}
		
		for(int i: arrayList) {
			System.out.println(i+" ");
		}
	
}
}
