import java.util.Scanner;
class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,z,count=0,digit,i,pro,sum=0;
        System.out.println("Enter number to check Armstrong:");
        n=sc.nextInt();
        z=n;
        while(z>0)
        {
            count=count+1;
            z=z/10;
        }
        System.out.println("Number of digits="+count);
        z=n;
        while(z>0)
        {
            digit=z%10;
            pro=1;
            for(i=1;i<=count;i++)
            pro=pro*digit;
            sum=sum+pro;
            z=z/10;
        }
        if(sum==n)
        System.out.println("Enter number is Armstrong");
        else
        System.out.println("Enter number is not Armstrong");
        sc.close();
    }
}