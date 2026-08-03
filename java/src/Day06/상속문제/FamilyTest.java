package Day06.상속문제;

class Parent {
	Parent() {
		System.out.println("Parent 1");
	}

	Parent(String str) {
		System.out.println("Parent 2");
	}

}

class Child extends Parent {
	Child() {
		// super()
		System.out.println("Child 1");
	}

	Child(String str) {
		// super()
		System.out.println("Child 2");
	}
}











public class FamilyTest {
	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child("a");
	}
}























