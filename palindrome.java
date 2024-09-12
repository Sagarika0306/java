import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,z;
        System.out.println("Enter Value:");
        n=sc.nextInt();
        z=n;
        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        if(rev==z)
        System.out.println("Enter value is palindrome:");
        else
        System.out.println("Enter value is not palindrome:");
        sc.close();
    }
}