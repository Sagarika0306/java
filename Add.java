import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,add=0;
        System.out.println("Enter number:");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            add=add+i;
            i=i+1;
        }
        System.out.println("Addition="+add);
        sc.close();
    }
}