/* 
! {COMMENTS} :-
JAVA SOURCE FILE STRUCTURE 
* {class} if a java program contains multiple classes then we can give any
* name to our program
* it also doesn't matter that which classes are containing main method .we can give any name
* .class file created = no. of classes in the program 
TODO  we can compile a .java file but we can run a .class file
! A program can have only one {public} class and many class (many main mehtods) and for every class a .class file we will be created
! .class program we run by cmd : java <class name>
! if we are running .class file and it doesn't have main method immediatly we'll get error
! we can't run java <filename> while .class file is not created : (eg : java First) it will be error
*/

class A {
  public static void main(String args[]) {
    System.out.println("main in class A");
  }
}

class B {
  public static void main(String args[]) {
    System.out.println("main in class B");
  }
}

class C {
  public static void main(String args[]) {
    System.out.println("main in class C");

  }
}

// ! we get error main method not found when we run cmd {java D}
class D {
}