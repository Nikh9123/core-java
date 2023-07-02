//working of instance variable
public class InstanceVar {
    private String name;

    public InstanceVar(String name) {
        this.name = name;
    }

    public void sayHello(String[] args) {
        System.out.println("the name is " + name);
    }
}

/*
 * In this example, the Person class has an instance variable name, which is a
 * private string. The constructor takes a name argument and assigns it to the
 * name instance variable using the this keyword. The sayHello method accesses
 * the name instance variable and uses it in the print statement.
 */