import java.util.Scanner;
class class_and_object
{
    int n;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check:");
        n=sc.nextInt();
        sc.close();
    }
    void putdata()
    {
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            count=count+1;
        }
        if(count==2)
        System.out.println("Enter Number is Prime");
        else
        System.out.println("Enter number is not Prime");
    }
    public static void main(String args[])
    {
        class_and_object aa=new class_and_object();
        aa.getdata();
        aa.putdata();
    }
}