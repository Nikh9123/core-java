class person {
    String name;
    int age;

    //final
     void display() {
        System.out.println("In super class");
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
}

class Employee extends person {
    int income;

    void display() {
        System.out.println("In derive or sub class hatthi");
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Income :" + income);

    }
}

// driver class
public class TestOverriding extends person {
    void display() {
        super.display();//it willl call main parent class 
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Nikhil";
        e1.age = 19;
        e1.income = 18000;
        TestOverriding t1 = new TestOverriding();
        t1.display();
        e1.display();

    }

}
