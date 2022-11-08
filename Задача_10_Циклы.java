package com.max.idea;
import java.util.Scanner;
import java.util.Arrays;

public class Задача_10_Циклы {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Пользователь вводит размер матрицы
        System.out.println("Введите количество строк");
        int rows = scan.nextInt();
        System.out.println("Введите количество столбцов");
        int cols = scan.nextInt();
        double[][] myArray = new double[rows][cols];
        //Пользователь вводит данные матрицы
        if (rows != 0 && cols != 0) {
            System.out.println("Заполните массив значениями");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    myArray[i][j] = scan.nextDouble();
                }
            }
            System.out.println("Ваш массив:");
            for (int i = 0; i < rows; i++) {
                System.out.println(Arrays.toString(myArray[i]));
            }
            //вывод первой строки матрицы на экран, где каждый элемент умножается на 3
            for (int j = 0; j < cols; j++) {
                myArray[0][j] *= 3;
            }
            System.out.println("Первая строка массива, умноженная на 3:");
            System.out.println(Arrays.toString(myArray[0]));
        } else
            System.out.println("Введите число отличное от нуля");
    }
}