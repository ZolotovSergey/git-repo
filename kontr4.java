package com.max.idea;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class kontr4 {
    public static void main(String[] args) {
        int count = 3;

        Scanner input = new Scanner(System.in);

        System.out.println("Отгадай загадку: сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        for (int i = 0; i < 3; i++) {
            String answer = input.nextLine();

            if (answer.equals("Заархивированный вирус")) {
                System.out.println("Правильно");
                break;
            } else if (answer.equals("Подсказка") && i == 0) {
                System.out.println("Подсказка на загадку");
                String answer1 = input.nextLine();
                if (answer1.equals("Заархивированный вирус")) {
                    System.out.println("Правильно");
                    break;}
                else if (answer1.equals("Подсказка")) {
                    System.out.println("Подсказка уже недоступна");
                }
                else{
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                }
            } else if (answer.equals("Подсказка") && i != 0) {
                System.out.println("Подсказка уже недоступна");
            } else if (i < 2) {
                System.out.println("Подумай еще!");
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
}
