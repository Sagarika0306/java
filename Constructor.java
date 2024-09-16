import java.util.Scanner;
class Constructor
{
    int a,b;
    Constructor( )
    {
        a=0;
        b=0;
    }
    Constructor(int x,int y)
    {
        a=x;
        b=y;
    }
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter First Number:");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        sc.close();
    }
    void display()
    {
        System.out.println("a="+a+"b="+b);
    }
    void output()
    {
        int c;
        c=a+b;
        System.out.println("Additin="+c);
    }
    public static void main(String args[])
    {
        Constructor aa=new Constructor();
        aa.display();
        aa.input();
        aa.output();
        Constructor bb=new Constructor(5,10);
        bb.display();
        bb.output();
    }
}