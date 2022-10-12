package classhome_week6sheetal;

public class AddTwoBinaryNumbers {
    public static void main(String [] args)
    {
    String s1="10";
    String s2="11";
    AddTwoBinaryNumbers  bn=new AddTwoBinaryNumbers();
        System.out.println("Input first binary number: 10");
        System.out.println("Input second binary number:11");
        System.out.println("Addition of two binary numbers");
}
    public String addBinaryNumbers(String b1,String b2)
    {
        int sum;
        int a1=Integer.parseInt(b1,2);
        int a2=Integer.parseInt(b2,2);
        sum=a1+a2;
        return Integer.toBinaryString(sum);

    }
}
