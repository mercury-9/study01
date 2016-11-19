package second_tasks;

import java.util.ArrayList;

/**
 * Created by Sputnik on 16.11.2016.
 */
public class Task3 {
    public static void main(String[] args) {

        //System.out.println(isPrime(6857));
        int chislo = 200000000;
        System.out.println(deliteli(chislo));
        int maxPrimeForChislo = 0;
        for (int i : deliteli(chislo)) {
            if (isPrime(i)) maxPrimeForChislo = i;
        }
        System.out.println ("Максимальный простой делитель числа это "+maxPrimeForChislo);
    }
    public static boolean isPrime (int n){
        if (n==2 || n==3 || n==5 || n==7) return true;
        else {
            int j=1;
            for (int k=2; k<n; k++) {
                if (n%k == 0) j++;
            }
            if (j >1) return false;
            else return true;
        }
    }
    public static ArrayList<Integer> deliteli (int n){
        long timer=-System.currentTimeMillis();
        int a=n;
        ArrayList<Integer> output = new ArrayList<>(a);
        for (int i=1; i<=a; i++){
            if (n%i == 0) output.add(i);
        }
        timer +=System.currentTimeMillis();
        System.out.println ("На создание массива ушло = "+timer+" milliseconds");
        return output;
    }
}
