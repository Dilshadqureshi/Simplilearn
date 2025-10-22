
public class ClassesStudent {

	static {
		System.out.println("Initalizer code");
		// String colleage = "XYZ";
		 //int count = 0;
	}
	String name;
	int age;
	String address;
	

	public ClassesStudent(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "ClassesStudent [name=" + name + ", age=" + age + ", address=" + address +  "]";
	}

	//static void studentCount() {
	//	count = count + 1;
	//}

	//int getCount() {
	//	return count;
	//}
}
