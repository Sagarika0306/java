import java.util.Scanner;
class A
{
    int a,b;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter First Number:");
        a=sc.nextInt();
        System.out.println("Enter Second Number:");
        b=sc.nextInt();
    }
    void add()
    {
        System.out.println("Addition="+(a+b));
    }
}
class B extends A
{
    int c;
    Scanner sc=new Scanner(System.in);
    void getdata()
    {

        System.out.println("Enter Number");
        c=sc.nextInt();
    }
    void display()
    {
        System.out.println("Addition:"+(a+b+c));
    }
}
class Inheritance
{
    public static void main(String args[])
    {
        B aa=new B();
        aa.input();
        aa.getdata();
        aa.add();
        aa.display();
        aa.sc.close();
       
    }
}