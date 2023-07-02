// Java program to demonstrate
// Upcasting Vs Downcasting

// Parent class
class Parent {
	String name;

	// A method which prints the
	// signature of the parent class
	void method() {
		System.out.println("Method from Parent");
	}
	void method2()
	{
		System.out.println("Method2 from Child");

	}
}

// Child class
class Child extends Parent {
	int id;

	// Overriding the parent method
	// to print the signature of the
	// child class
	@Override
	void method() {
		System.out.println("Method from Child");
	}
	void method2()
	{
		System.out.println("Method2 from Child");
		
	}
}

// Demo class to see the difference
// between upcasting and downcasting
public class Upcasting2 {

	// Driver code
	public static void main(String[] args) {
		// Upcasting
		Parent p = new Child();
		p.name = "GeeksforGeeks";

		// Printing the parentclass name
		System.out.println(p.name);
		// parent class method is overridden method hence this will be executed
		p.method();

		// Trying to Downcasting Implicitly
		// Child c = new Parent(); - > compile time error

		// Downcasting Explicitly
		Child c = (Child) p;

		c.id = 1;
		System.out.println(c.name);
		System.out.println(c.id);
		c.method();
	}
}
