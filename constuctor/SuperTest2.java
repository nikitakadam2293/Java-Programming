package constuctor;

 class Person
{
    int age=50;
}
public class SuperTest2 extends Person{

        int age=30;  // instance variable
        void ageA()
        {
            int age=20;  // local variable
        }
        Person p=new Person();
       /* System.out.println("p.age")  // 50
        System.out.println(super.age)  // 50
            System.out.println(age)  // 20
            System.out.println(this.age)  // 30*/






}
