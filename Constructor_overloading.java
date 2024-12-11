public class Constructor_overloading
{
    String name;
    Constructor_overloading()
    {
        name="Rajesh";
    }
    Constructor_overloading(String  name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        Constructor_overloading c=new Constructor_overloading();
        c.display();
        Constructor_overloading c1=new Constructor_overloading();
        c1.display();
    }
}