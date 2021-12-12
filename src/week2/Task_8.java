package week2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % 7 == 0 || b % 7 == 0 && a > 0 && b > 0 && a > b) {

            for (int i = b; i < a; i++) {
                if (i % 2 != 0 && i != b) {
                    System.out.println(i);



                }
            }
        }

    }
}
