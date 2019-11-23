package pl.altkom.threads.isPrimeExample;

import java.util.List;
import java.util.Random;

// TO BE FINISHED.........................?

public class PrimeChecker implements Runnable{
    private List<Integer>primes;
    Random r = new Random();
    public boolean isPrimeChecker(int number){
        for(int i=2;i<number/2;i++) {
            if(number%i==0)
                return false;
        }
        return true;
    }

    @Override
    public void run() {
        for(int i = 0; i<1000000; i++){
            int n = r.nextInt();
            if(isPrimeChecker(n)){
                //synchronized (Main.semaphore);
                primes.add(n);
            }
        }
    }
}
