package constructorConcept;

public class A {

	public A() {

		System.out.println("Parent class constructor");

	}
	
	public A(int i) {

		System.out.println("Parent class constructor with one parameter i = " + i);

	}
	public A(int i, int j) {

		System.out.println("Parent class constructor with one parameter i = " + i);
		System.out.println("Parent class constructor with one parameter j = " + j);
	}
}
