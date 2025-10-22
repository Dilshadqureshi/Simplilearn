
public class Student
{
String name;
int age;
String address;

public Student(String name,int age,String address) {
	this.name=name;
	this.age=age;
	this.address=address;
}

public void setName(String name) {
	this.name=name;
}

public void setAge(int age) {
	this.age=age;
}

public void setAddress(String address) {
	this.address=address;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public String getAddress() {
	return address;
}

public String toString() {
	return("Student Name Is: "+this.getName()+"Student Age:"+this.getAge()+"  Address:"+this.getAddress());
}

public static void main (String []args) {
	Student std= new Student("Dilshad",30 , "Sakinaka mumbai 400072");
	System.out.println(std.toString());
	System.out.println("-----------------------------------------");
	System.out.println(std.getName());
	System.out.println(std.getAge());
	System.out.println(std.getAddress());
}
}
