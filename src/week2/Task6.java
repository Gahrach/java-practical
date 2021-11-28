package week2;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        if (number < 0) {
            number = number * -1;
        }
        int a = number % 6+2;
        System.out.println(a);
    }


}
