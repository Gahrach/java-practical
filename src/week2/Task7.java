package week2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= 10 && b == 10 ) {
            System.out.println ("both false");}
        if (a <= 10 && b != 10) {
            System.out.println("a false b true");
        }
        if (a > 10 && b ==10)
        {
            System.out.println("a true b false");}
        if(a > 10 && b != 10) {
            System.out.println("both true");
        }


    }
}