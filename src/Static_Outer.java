
public class Static_Outer {
	static int outerStaticMember = 10;
	int instanceMember = 20;

	private static int outerPrivateMember = 30;

	static class StaticNetsedClass {
		void display() {
			System.out.println("static memeber of outer class " + outerStaticMember);

			System.out.println("private static member of outer class=" + outerPrivateMember);

		}
	}
}
