import java.util.TreeMap;

public class TreeMap_Demo 
{
public static void main (String []args) {
	
	TreeMap<Integer, String>treeMap= new TreeMap<>();
	treeMap.put(3, "A");
	treeMap.put(2, "C");
	treeMap.put(1, "B");
	
	System.out.println(treeMap);
}
}
