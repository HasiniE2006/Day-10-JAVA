public class  This_as_object
{
    String name;
    This_as_object(String name) 
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String[] args) {
        This_as_object o=new  This_as_object("Rajesh");
        o.dis1();  
    }
} 
class teacher{
    public void teach(This_as_object s)
    {
        s.dis1();
    }
}