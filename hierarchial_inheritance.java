import java.util.Scanner;
class A
{
    int x,y;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        x=sc.nextInt();
        System.out.println("Enter Second Number:");
        y=sc.nextInt();
        sc.close();
    }
}
class B extends A
{
    void add()
    {
        System.out.println("Addition="+(x+y));
    }
}
class C extends A
{
    void sub()
    {
        System.out.println("Substraction="+(x-y));
    }
}
class multilevel_inheritance
{
    public static void main(String args[])
    {
        B aa=new B();
        C bb=new C();
        aa.input();
        aa.add();
        bb.input();
        bb.sub();
    }
}