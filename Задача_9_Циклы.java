package com.max.idea;
import java.util.Scanner;

public class Задача_9_Циклы {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длинну массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        double array[] = new double[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        double result = 0;

        for (double d : array) {
            result += d;
        }
        double sr = result / array.length;
        System.out.println("Среднее арифметическое " + sr);

        for(int i = 0; i < size; i++) {
            array[i] = array[i] * sr;
            System.out.println("элементы массива умноженные на среднее арифметическое " + array[i]);
        }
    }
}


