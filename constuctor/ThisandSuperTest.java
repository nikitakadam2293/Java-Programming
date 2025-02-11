package constuctor;

class ThisSuper
{
    ThisSuper()
    {
        this(22,"Program");
        System.out.println("parent class no arg constructor");
    }
    ThisSuper(int age,String name)
    {
        System.out.println("parent class 2 ==arg constructor");
    }
}
public class ThisandSuperTest extends ThisSuper {
    ThisandSuperTest()
    {
        this(11,"java");
        System.out.println("child class no arg constructor");
    }
    ThisandSuperTest(int age,String name)
    {
        System.out.println("child class 2 arg constructor");
    }

    public static void main(String[] args) {
        ThisandSuperTest obj=new ThisandSuperTest();
    }
}
