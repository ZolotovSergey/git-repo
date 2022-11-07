package com.max.idea;
import java.util.Scanner;

public class Задача_7_Циклы {
    public static void main(String[] args) {
        int x = 7;
        int y = 9;
        int z = 1;
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длинну массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int a: array) {
            if (a==x||a==y||a==z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}