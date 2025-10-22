import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo 
{
public static void main (String []args) {
	Queue<String> queue=new PriorityQueue<>();
	queue.add("Dilshad");
	queue.add("Arif");
	queue.add("Quraishi");
	
	System.out.println("Original:"+queue);
	queue.remove();
	
	System.out.println("Fter Delete Element:"+queue );
	System.out.println("---------------------------------------");
	
	String head=queue.poll();
	System.out.println(head);
}
}
