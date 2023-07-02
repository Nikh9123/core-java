
class Order 
{
static int c;
static
{
System.out.println("Welcome to static block");//1
c=10;
}

{
System.out.println("Welcome to LPU");//3
}

public Order()
{
 
System.out.println("Order constructor");//4
}
public Order(int a)
{

System.out.println("Order parameter constructor");//5
}
public static void main(String[] aa)
{
System.out.println("main block");//2
Order obj= new Order();
Order obj1= new Order(3);
System.out.println(Order.c);
}}
