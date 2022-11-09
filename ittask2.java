package com.max.idea;
import java.util.Scanner;

public class ittask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите уравнение: ");
        String ur = input.nextLine();
        int result;

        int indexM = ur.indexOf("x");
        //System.out.println(indexM);

        char x0 = ur.charAt(0);
        int y0 = Character.getNumericValue(x0);
        char x1 = ur.charAt(1);
        char x2 = ur.charAt(2);
        int y2 = Character.getNumericValue(x2);
        char x4 = ur.charAt(4);
        int y4 = Character.getNumericValue(x4);
        if (indexM == 0 && x1 == '/') {
            result = y4 * y2;
            System.out.println(result);
        }
        if (indexM == 0 && x1 == '*') {
            result = y4 / y2;
            System.out.println(result);
        }
        if (indexM == 0 && x1 == '+') {
            result = y4 - y2;
            System.out.println(result);
        }
        if (indexM == 0 && x1 == '-') {
            result = y4 + y2;
            System.out.println(result);
        }
        if (indexM == 2 && x1 == '/') {
            result = y0 / y4;
            System.out.println(result);
        }
        if (indexM == 2 && x1 == '*') {
            result = y4 / y0;
            System.out.println(result);
        }
        if (indexM == 2 && x1 == '+') {
            result = y4 - y0;
            System.out.println(result);
        }
        if (indexM == 2 && x1 == '-') {
            result = y0 - y4;
            System.out.println(result);
        }
        if (indexM == 4 && x1 == '/') {
            result = y0 / y2;
            System.out.println(result);
        }
        if (indexM == 4 && x1 == '*') {
            result = y0 * y2;
            System.out.println(result);
        }
        if (indexM == 4 && x1 == '+') {
            result = y0 + y2;
            System.out.println(result);
        }
        if (indexM == 4 && x1 == '-') {
            result = y0 - y2;
            System.out.println(result);
        }
    }
}

