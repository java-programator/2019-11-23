package pl.altkom.threads;

class IncrementTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            Example02.counter++;
        }
        System.out.println("Skończyłem " + Example02.counter);
    }
}

public class Example02 {

    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new IncrementTask());
        t.start();
        t.join();
        System.out.println(counter);
    }
}
