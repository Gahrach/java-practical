package week2;

import java.util.Scanner;

public class Task7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % 5 != 0 && b % 5 == 0){
            System.out.println( " both true");}
        else if (a % 5 == 0 && b % 5 == 0){
            System.out.println("a false b true");}
        else if (a % 5 != 0 && b % 5 != 0){
            System.out.println("a true b false");}
        else{
            System.out.println( "both false");}
        }
    }
