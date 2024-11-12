import java.util.Scanner;
class star
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int j,n,s,i;
        System.out.println("Enter number of rows:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        n=n-1;
        for(i=1;i<=n;i++)
        {
            for(s=1;s<=i;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*(n-i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}