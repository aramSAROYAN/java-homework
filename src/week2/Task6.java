package week2;
import java.util.Random;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int p = random.nextInt();
        if (p<=0){
            p=p*(-1);
        }
        p = p%6;
        p+=2;
        System.out.println(p);

    }
}
