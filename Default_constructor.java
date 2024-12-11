class a
{
 int c;
 String b;
 a()
 {
    this.c=345;
    this.b="hello";
 }
 void display()
 {
    System.out.println(b+" "+c);
 }
}
 class Default_constructor {
    public static void main(String args[])
    {
        a s=new a();
        s.display();
    }
    
}
