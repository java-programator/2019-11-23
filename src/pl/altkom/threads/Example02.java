package pl.altkom.threads;

class IncrementTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            synchronized (Example02.semaphore) {
                Example02.counter++;
            }
        }
        System.out.println("Skończyłem dodawać " + Example02.counter);
    }
}

class DecrementTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            synchronized (Example02.semaphore) {
                Example02.counter--;
            }
        }
        System.out.println("Skończyłem odejmować " + Example02.counter);
    }
}

public class Example02 {

    static int counter = 0;
    static Object semaphore = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new IncrementTask());
        Thread t2 = new Thread(new DecrementTask());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);
    }
}
