public class Method_overloading {
    static void a()
    {
        System.out.println("HELLO");
    }
    static void a(int b)
    {
        System.out.println("HELLO"+b);
    }
    static void a(int b,int c)
    {
        System.out.println("HELLO"+b+" "+c);
    }
    public static void main(String[] args) {
        a();
        a(6);
        a(4,5);
    }
}
