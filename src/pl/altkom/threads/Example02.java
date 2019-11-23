package pl.altkom.threads;

class TaskIncrement implements Runnable {
    @Override
    public void run() {
        synchronized (Example02.semaphore) {
            for (int i = 0; i < 1000000; i++) {
                Example02.counter++;
            }
        }
        System.out.println("Skończyłem inkrementować "+Example02.counter);
    }
}
class TaskDecrement implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            synchronized (Example02.semaphore) {
                Example02.counter--;
            }
        }
        System.out.println("Skończyłem dekrementować "+Example02.counter);
    }
}

public class Example02 {
    static int counter = 0;
    static final Object semaphore = new Object();
    public static void main(String[] args) throws InterruptedException {
            Thread t1 = new Thread(new TaskIncrement());
            Thread t2 = new Thread(new TaskDecrement());
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(counter);
        }

    }



