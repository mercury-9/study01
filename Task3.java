package second_tasks;

import java.util.ArrayList;

/**
 * Created by Sputnik on 16.11.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        long chisloX = 600851475143L;
        long chislo = 775147L;
        long maxPrimeForChislo = 0;
        for (long i : deliteli(chisloX, chislo)) {
            if (isPrime(i)) maxPrimeForChislo = i;
        }
        System.out.println ("Максимальный простой делитель числа это "+maxPrimeForChislo);
    }
    public static boolean isPrime (long n){
        if (n==2 || n==3 || n==5 || n==7) return true;
        else {
            long j=1;
            for (long k=2; k<n; k++) {
                if (n%k == 0) j++;
            }
            if (j >1) return false;
            else return true;
        }
    }
    public static ArrayList<Long> deliteli (long m, long n){
        long timer=-System.currentTimeMillis();
        ArrayList<Long> output = new ArrayList<>();
        for (long i=1; i<=n; i++){
            if (m%i == 0) output.add(i);
        }
        timer +=System.currentTimeMillis();
        System.out.println ("На создание массива ушло = "+timer+" milliseconds");
        return output;
    }
}
