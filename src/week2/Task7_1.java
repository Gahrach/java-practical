package week2;

import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 0 && b > 0) {
            System.out.println(" both a and b legal");
        } else {
            System.out.println("illegal");
        }
    }
}




