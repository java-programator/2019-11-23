package pl.altkom.philosophers;

import java.util.Random;

public class Philosopher implements Runnable {
    Random r = new Random();
    int id;
    Fork left;
    Fork right;

    public Philosopher(int id, Fork left, Fork right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Filozof " + id + " myśli");
            try {
                Thread.sleep(r.nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (left) {
                System.out.println("Filozof " + id + " podniósł lewy widelec");
                synchronized (right) {
                    System.out.println("Filozof " + id + " podniósł prawy widelec");
                    try {
                        Thread.sleep(r.nextInt(3000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
}
