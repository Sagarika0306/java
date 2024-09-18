import java.util.Scanner;
class check
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        a=sc.nextInt();
        if(a>0)
        System.out.println("Positive Number:");
        else if(a<0)
        System.out.println("Negative Number:");
        else
        System.out.println("Number is zero:");
        sc.close(); 
   }
}