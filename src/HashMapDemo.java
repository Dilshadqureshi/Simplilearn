import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo
{
public static void main(String []args) {
	Map<String, Integer>hashmap=new HashMap<String, Integer>();
	hashmap.put("a", 10);
	hashmap.put("b", 20);
	hashmap.put("c", 30);
	hashmap.put("e", 50);
	
	System.out.println("Size of map is:-"+hashmap.size());
	System.out.println(hashmap);
	
	if(hashmap.containsKey("a")) {
		Integer a=hashmap.get("a");
		System.out.println("Value for key "+"\"a\" is:-"+a);
	} 
		for(String key:hashmap.keySet()) {
			System.out.println("key:"+key+",value:"+hashmap.get(key));
				
	}
	for(Entry<String, Integer>entry:hashmap.entrySet()) {
		System.out.println("key"+entry.getKey()+",value:"+entry.getValue());
	}

}}