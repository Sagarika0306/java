import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,count=0;
        System.out.println("Enter Number to check Prime:");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            if(n%i==0)
            count=count+1;
            i=i+1;
        }
        if(count==2)
        System.out.println("Enter number is prime");
        else
        System.out.println("Enter number is not prime");
        sc.close();
    }
}