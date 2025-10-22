
public class ClassesStatic
{
public static void main(String []args) {
	
	ClassesStudent cstd=new ClassesStudent("Dilshad",30,"mumbai 23");
    System.out.println(cstd.getName());
	System.out.println(cstd.getAge());
	System.out.println(cstd.getAddress());
	//System.out.println(ClassesStudent.colleage);
	System.out.println("------------------------------------------------");
	ClassesStudent cstd1=new ClassesStudent("Khan",25,"abc 13");
    System.out.println(cstd1.getName());
	System.out.println(cstd1.getAge());
	System.out.println(cstd1.getAddress());
	
	System.out.println("------------------------------------------------");

	ClassesStudent cstd2=new ClassesStudent("Quraishi",28,"pune 25");
    System.out.println(cstd2.getName());
	System.out.println(cstd2.getAge());
	System.out.println(cstd2.getAddress());
}
}
