import java.util.HashSet;
import java.util.Set;

public class HashSetDemo 
{
public static void main (String []args) {
	Set<String> hashset= new HashSet<>();
	hashset.add("A");
	hashset.add("B");
	hashset.add("C");
	hashset.add("C");
	hashset.add("D");
	
	System.out.println(hashset);
	
	System.out.println("List  contain c or not? "+hashset.contains("C"));
	
	hashset.remove("A");
	System.out.println("List after remove A:"+hashset);
	
	for(String item:hashset) {
		System.out.println(item);
	}
	
	
}
}
