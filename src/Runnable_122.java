import java.util.Scanner;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("I Am A Thread 1 .");
        System.out.println("I Am A Thread 1 .");
        System.out.println("I Am A Thread 1 .");
        System.out.println("I Am A Thread 1 .");
        System.out.println("I Am A Thread 1 .");
        System.out.println("I Am A Thread 1 .");
        System.out.println("I Am A Thread 1 .");
        System.out.println("I Am A Thread 1 .");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n<10)
        System.out.println("I Am A Thread 2 .");
        System.out.println("I Am A Thread 2 .");
        System.out.println("I Am A Thread 2 .");
        System.out.println("I Am A Thread 2 .");
        System.out.println("I Am A Thread 2 .");
        System.out.println("I Am A Thread 2 .");
        System.out.println("I Am A Thread 2 .");
        System.out.println("I Am A Thread 2 .");
        System.out.println("I Am A Thread 2 .");
        System.out.println("I Am A Thread 2 .");
        System.out.println("I Am A Thread 2 .");
    }
}
public class Runnable_122 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
