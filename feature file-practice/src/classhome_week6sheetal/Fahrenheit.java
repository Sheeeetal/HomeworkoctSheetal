package classhome_week6sheetal;
import java.util.Scanner;
public class Fahrenheit {public static void main(String[] args)
{
    Fahrenheit f=new Fahrenheit();

}
    public void fahrenheit()
    {

        double c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter degree fahrenheit");
        double fh=s.nextInt();
        c=((fh-32)*5/9);
        System.out.println("Celsius is-"+c);
    }
}


