import java.util.Scanner;
class powerofxy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,pro=1;
        System.out.println("Enter Base Number:");
        x=sc.nextInt();
        System.out.println("Enter Power Number:");
        y=sc.nextInt();
        while(y>0)
        {
            pro=pro*x;
            y--;
        }
        System.out.println("Value="+pro);
        sc.close();
    }
}