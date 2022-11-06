package com.max.idea;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Задача_4_Операторы {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = requestNumber();
        numbers[1] = requestNumber();
        numbers[2] = requestNumber();
        float avrn = numbers.length;
        double averege = (numbers[0] + numbers[1] + numbers[2])/avrn;
        System.out.println("Найти и вывести в консоль среднее арифметическое этих чисел: " + averege);

        double averege2 = averege/2;
        System.out.println("Разделить среднее арифметическое на 2 и округлить в меньшую сторону: " + Math.floor(averege2));

        if (Math.floor(averege2)>3) {
            System.out.println("Программа выполнена корректно");
        } else {
            System.out.println("Программа не выполнена корректно");
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
