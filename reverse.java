import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0;
        System.out.println("Enter Value:");
        n=sc.nextInt();
        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println("Reverse="+rev);
        sc.close();
    }
}