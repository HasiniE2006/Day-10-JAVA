interface mobileapp
{
    public void menu();
    public void rating();
    public void contact();
}
class b implements mobileapp
{
    public void menu()
    {
        System.out.println("HELLO");
    }
    public void rating()
    {
        System.out.println("HELLO RATING");
    }
    public void contact()
    {
        System.out.println("HELLO CONTACT");
    }
}
public class Interface
{
public static void main(String[] args) {
    b a=new b();
 a.contact();
}
}
