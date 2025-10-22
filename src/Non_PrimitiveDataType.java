
public class Non_PrimitiveDataType 
{
public static void main(String []args) 
{
String str="Dilshad";
System.out.println("String without new keyword:"+str);

String str1=new String("test");
System.out.println("String is with new keyword:"+str1);

int arr[];
arr=new int[2];
arr[0]=0;
arr[1]=1;
//arr[2]=2;
System.out.println(arr);
System.out.println(arr[0]);
System.out.println(arr[1]);
}
}
