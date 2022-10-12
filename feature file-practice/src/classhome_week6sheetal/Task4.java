package classhome_week6sheetal;

public class Task4 {
    //instance variables
    String a="Sheetal";
    String b="Viradiya";
    //Static variables
    static short x=10000;
    static short y=20000;

    public static void main(String[] args)
    {
        Task4 p=new Task4();
        p.method1();//Calling instance method from static method by creating object
        method2();
    }
    //instance variable
    public void method1()
    {
//instance area
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
    //static method
    public static void method2() {


//static area
        Task4 p1 = new Task4();
        System.out.println(p1.a); //Calling instance variable from static method by creating object
        System.out.println(p1.b);
        System.out.println(Task4.x);//Calling by class
        System.out.println(y);//Calling directly

    }
}

