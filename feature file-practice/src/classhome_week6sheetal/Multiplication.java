package classhome_week6sheetal;

import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args)
    {
        Multiplication m=new Multiplication();
        m.multiplication();

    }
    public void multiplication() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = s.nextInt();
        System.out.println("Multiplication table of the above number");
        int a;
        for (int i = 1; i <= 10; i++) {
            a = x * i;
            System.out.println("8x" + i + "=" + a);
        }
    }
}

