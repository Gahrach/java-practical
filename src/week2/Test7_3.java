package week2;

import java.util.Scanner;

public class Test7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        if (a > 10 && a % 2 != 0 && b < 1  && b % 2 != 0){
            System.out.println("a true b true");
        }
          else if (a <= 10 && b < 1 && b % 2 != 0){
            System.out.println("a false b true");}

          else if (a > 10 && a % 2 == 0 && b < 1 && b % 2 != 0 ){
            System.out.println("a false b true");}

        else if (a > 10 && a % 2 != 0 && b >= 1  ) {
            System.out.println( "a true b false");}

        else if (a > 10 && a % 2 != 0 && b < 1 && b % 2 == 0 ){
            System.out.println( "a true b false");}
        else {
            System.out.println( "both false");
        }
    }
}























