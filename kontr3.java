package com.max.idea;
import java.util.Scanner;

public class kontr3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк: ");

        int n = input.nextInt();
        input.nextLine();
        String[] strings = new String[n];
        Integer[] result = new Integer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку №" + (i + 1));
            strings[i] = input.nextLine();
            input.nextLine();
        }

        for (int i = 0; i < n; i++) {
            String str = "";

            for (int j = 0; j < strings[i].length(); j++) {
                char c = strings[i].charAt(j);

                if (str.indexOf(c) == -1) {
                    str += c;
                }
            }

            result[i] = str.length();
        }

        int winner = result[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (result[i] > winner) {
                winner = result[i];
                index = i;
            }
        }

        System.out.println("Результат: " + strings[index]);
    }
}