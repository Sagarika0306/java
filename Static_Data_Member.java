class Static_Data_Member
{
    int roll;
    String name;
    static String Cname="XYZ";
    Static_Data_Member(int x,String y)
    {
        roll=x;
        name=y;
    }
    void display()
    {
        System.out.println("Roll="+roll+" "+"Name="+name+" "+"College name="+Cname);
    }
    static void change()
    {
        Cname="ABC";
    }
    public static void main(String args[])
    {
        Static_Data_Member aa=new Static_Data_Member(101,"Ram");
        Static_Data_Member bb=new Static_Data_Member(102,"Shyam");
        aa.display();
        bb.display();
        Static_Data_Member.change();
        aa.display();
        bb.display();
    }
}