package pl.altkom.threads;

class Task02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            Example02.counter++;
        }
        System.out.println("Skończyłem");
    }
}

public class Example02 {
    static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
            Thread thread = new Thread(new Task02());
            thread.start();
            thread.join();
            System.out.println(counter);
        }

    }



