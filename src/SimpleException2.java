import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleException2
{
public static void main (String []args) throws IOException {
	FileReader fie=new FileReader("C:\\Users\\User\\Desktop");
	BufferedReader fileinput=new BufferedReader(fie);
	
	for(int counter =0;counter < 3;counter++)
		System.out.println(fileinput.readLine());
	fileinput.close();


	
	
}
}
