class Employee {
    private int id;
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

}

public class DemoConst {
    public static void main(String[] args) {
        // Employee harry = new Employee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier

        Employee nikhil = new Employee();
        nikhil.setId(12100798);
        System.out.println(nikhil.getId());
        nikhil.setName("Nikhil Satyam");
        System.out.println(nikhil.getName());
    }
}
