package pl.altkom.threads.isPrimeExample;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public Object semaphore = new Object();

    public static void main(String[] args) {
        List<Integer> primes = new LinkedList<>();

        Thread t1 = new Thread(new PrimeChecker());
        Thread t2 = new Thread(new PrimeChecker());
        Thread t3 = new Thread(new PrimeChecker());
        Thread t4 = new Thread(new PrimeChecker());
        Thread t5 = new Thread(new PrimeChecker());




    }
}
