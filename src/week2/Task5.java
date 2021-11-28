package week2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18 ) {
            System.out.println("can vote");
        } else {
            System.out.println("can't vote");
        }
    }
}
