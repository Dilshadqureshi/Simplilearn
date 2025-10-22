import java.util.LinkedList;

public class LinkedList_Demo 
{
public static void main (String[]args) {
	LinkedList<String>list=new LinkedList<String>();
	list.add("A");
	list.addLast("B");
	list.addFirst("C");
	list.add(2,"D");
	
	System.out.println(list);
	list.add("Dil");
	list.add(2,"Z");
	list.removeFirst();
	list.remove("A");
	System.out.println(list);
}
}
