package multithreading;

public class CreateThreadUsingRunnableScenario1 {

    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        CreateThreadUsingRunnableScenario1 obj = new CreateThreadUsingRunnableScenario1();
        Thread t1 = new Thread();

        t1.start();
    }
}
