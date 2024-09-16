import java.util.Scanner;
class A
{
    int a;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter First Number:");
        a=sc.nextInt();
    }
}
class B extends A
{
    int b;
    Scanner sc=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter Second Number:");
        b=sc.nextInt();
    }
}
class C extends B
{
    void add()
    {
        System.out.println("Addition="+(a+b));
    }
}
class multilevel_inheritance
{
    public static void main(String args[])
    {
        C aa=new C();
        aa.input();
        aa.getdata();
        aa.add();
        aa.sc.close();
    }
}