package practice.day3;

import java.util.Scanner;

public class CW1 {
    public static void Calendar (){
        int thisYear = 2020;
        int period = 4;
        int year;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        int x = year % 4;
        System.out.println(x);
    }
}
