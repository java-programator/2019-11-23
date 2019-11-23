package pl.altkom.primes;

import java.util.List;
import java.util.Random;

import static pl.altkom.primes.Main.semaphore;

public class PrimeGenerator implements Runnable {

    private List<Integer> primes;
    private Random r = new Random();

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public PrimeGenerator(List<Integer> primes) {
        this.primes = primes;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            int n = r.nextInt();
            if (isPrime(n)) {
                synchronized (semaphore) {
                    primes.add(n);
                }
            }
        }
    }
}
