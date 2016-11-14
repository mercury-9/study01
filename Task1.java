package first_tasks;

/**
 * Created by Sputnik on 14.11.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int s=0;
        for (int i=1; i<1000; i++){
            if (i%3 == 0) s=s+i;
            if (i%5 == 0) s=s+i;
        }
        System.out.println(s);
    }
}
