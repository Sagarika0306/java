import java.util.Scanner;
class demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,pro=1,digit;
        System.out.println("Enter Value:");
        n=sc.nextInt();
        while(n>0)
        {
            digit=n%10;
            if(digit%2==0)
            sum=sum+digit;
            else
            pro=pro*digit;
            n=n/10;
        }
        System.out.println("Sum="+sum+"Product="+pro);
        sc.close();
    }
}