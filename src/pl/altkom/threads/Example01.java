package pl.altkom.threads;

class Task01 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Jestem w wątku " + i);
            System.out.flush();
        }
    }
}

public class Example01 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Task01());
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Jestem w wątku głównym " + i);
            System.out.flush();
        }
    }
}
