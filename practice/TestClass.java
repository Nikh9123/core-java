// Java program to demonstrate working of
// interface

import java.io.*;

import javax.swing.AbstractAction;

// A simple interface
interface In1 {

	// public, static and final
	final int a = 10;

	// public and abstract
	void display();
    public abstract void printNumber();
}

// A class that implements the interface.
class TestClass implements In1 {

	// Implementing the capabilities of
	// interface.
	public void display(){
	System.out.println("Geek");
	}
    public void printNumber()
    {
        System.out.println("yess cudos to abstrc");
    }
	// Driver Code
	public static void main(String[] args)
	{
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);
        t.printNumber();
	}
}
