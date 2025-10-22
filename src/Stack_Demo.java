import java.util.Stack;

public class Stack_Demo
{
public static void main (String [] args) {
	Stack<String> stack= new Stack<String>();
	stack.push("America");
	stack.push("India");
	stack.push("Dubai");
	
	System.out.println("Stack:"+stack);
	
	String popedElement=stack.pop();
	System.out.println("popedElement:"+stack);

	String popedElement1=stack.peek();
	System.out.println("popedElement1:"+stack);
	
}
}
