public class This_referingmethod {
    void display()
    {
        System.out.println("hello");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String[] args) {
        This_referingmethod o=new This_referingmethod();
        o.dis1();  
    }
}
