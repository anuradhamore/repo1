package constructorConcept;

public class ConstructorExample {

	String name; // global variable/class variable
	int age;

	public ConstructorExample() { // 0 parameter
		System.out.println("Default Constructor");
	}

	public ConstructorExample(int i) { // 1 parameter
		System.out.println("one parameter");
		System.out.println(i);
	}

	public	ConstructorExample(int i, int j) { // 2 parameter
		System.out.println("two parameters");
		System.out.println(i + " " + j);
	}

	public ConstructorExample(String name1, int age1) { // local variable
		this.name = name1;
		this.age = age1;
		

	}

	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample();
		ConstructorExample ce1 = new ConstructorExample(10);
		ConstructorExample ce2 = new ConstructorExample(20, 30);
		ConstructorExample ce3 = new ConstructorExample("Tom", 25);
		System.out.println(ce3.name);
		System.out.println(ce3.age);
	}

}
