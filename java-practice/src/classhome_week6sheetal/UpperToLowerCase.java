package classhome_week6sheetal;

//return type with parameters
public class UpperToLowerCase
{
    public static void main(String[] args)
    {
        UpperToLowerCase ul=new UpperToLowerCase();
        String result=ul.upperToLower("SHEETAL");
        System.out.println("Conversion from upper to lower: " +result);
    }
    public String upperToLower(String s1)
    {
        String s2;
        s2=s1.toLowerCase();
        System.out.println(s1);
        return s2;
    }
}
