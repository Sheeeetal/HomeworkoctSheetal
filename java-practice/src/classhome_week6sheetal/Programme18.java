package classhome_week6sheetal;

import java.util.Scanner;

public class Programme18
{
    int add,sub,mul,div,mod; //Instance variable
    int total; //Instance variable
    public static void main(String[] args)
    {
        Programme18 obj=new Programme18();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=s.nextInt();
        System.out.println("Enter second number");
        int y=s.nextInt();
        obj.sumProgramme18(x,y);
    }
    public void sumProgramme18(int x,int y)
    {
        add=x+y;
        System.out.println("125+24= " + add);
        sub=x-y;
        System.out.println("125-24= " + sub);
        mul=x*y;
        System.out.println("125*24= " + mul);
        div=x/y;
        System.out.println("125/24= " + div);
        mod=x%y;
        System.out.println("125 mod 24= " + mod);
    }
}


