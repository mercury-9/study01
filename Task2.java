package first_tasks;

/**
 * Created by Sputnik on 14.11.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        int s=0;
        int a=1;
        int b=2;

        while (b<=4000000) {
            s=s+b;
            a=a+b;
            b=b+a;
        }
        System.out.println(s);
    }
}
