class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public MyMainEmployee() {
        id = 45;
        name = "Johny sins";
    }

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

public class ConstructDemo {
    public static void main(String[] args) {
        MyMainEmployee e1 = new MyMainEmployee(121, "Nikhil");
        MyMainEmployee e2 = new MyMainEmployee();
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e2.getId());
        System.out.println(e2.getName());
    }
}
