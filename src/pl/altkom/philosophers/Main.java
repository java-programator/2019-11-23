package pl.altkom.philosophers;

public class Main {
    public static void main(String[] args) {
        Fork f1 = new Fork(1);
        Fork f2 = new Fork(2);
        Fork f3 = new Fork(3);
        Fork f4 = new Fork(4);
        Fork f5 = new Fork(5);

        Philosopher p1 = new Philosopher(1, f1, f2);
        Philosopher p2 = new Philosopher(2, f2, f3);
        Philosopher p3 = new Philosopher(3, f3, f4);
        Philosopher p4 = new Philosopher(4, f4, f5);
        Philosopher p5 = new Philosopher(5, f5, f1);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
