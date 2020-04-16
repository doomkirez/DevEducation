package practice.day3;

import java.util.Scanner;
public class CW3 {
    public static void main (String[] args){
        int numberOne;
        int numberTwo;
        int numberThree;
        Scanner num = new Scanner (System.in);

        System.out.println("Input number one");
        numberOne = num.nextInt();
        System.out.println("Input number two");
        numberTwo = num.nextInt();
        System.out.println("Input number three");
        numberThree = num.nextInt();

        if ((numberOne > numberTwo) && (numberOne > numberThree)) {
            System.out.println("Maximum number:" + numberOne);
        } else if ((numberTwo > numberOne) && (numberTwo > numberThree)) {
            System.out.println("Maximum number:" + numberTwo);
        } else {
            System.out.println("Maximum number:" + numberThree);
        }
    }

}
