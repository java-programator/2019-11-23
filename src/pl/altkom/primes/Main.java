package pl.altkom.primes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static Object semaphore = new Object();
    public static void main(String[] args) throws InterruptedException {
        List<Integer> primes = new LinkedList<>();

        Thread t1 = new Thread(new PrimeGenerator(primes));
        Thread t2 = new Thread(new PrimeGenerator(primes));
        Thread t3 = new Thread(new PrimeGenerator(primes));
        Thread t4 = new Thread(new PrimeGenerator(primes));
        Thread t5 = new Thread(new PrimeGenerator(primes));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        primes.forEach(System.out::println);
    }
}
