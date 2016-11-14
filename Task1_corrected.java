package first_tasks;

/**
 * Created by Sputnik on 14.11.2016.
 */
public class Task1_corrected {
    public static void main(String[] args) {
        int s=0;
        for (int i=1; i<1000; i++){
            if (i%3 == 0) s=s+i;
            else {
                if (i % 5 == 0) s = s + i; //до этого число, которое делилось и на 3 и на 5 суммировалось 2 рааз
            }
        }
        System.out.println(s);
    }
}
