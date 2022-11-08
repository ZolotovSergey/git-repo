package com.max.idea;
import java.util.Scanner;

public class Работа_с_данными {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Ввести первое  число с клавиатуры и записать его в строковую переменную.
        System.out.println("Введите первое число");
        String str = scan.nextLine();
        double num1 = Double.valueOf(str);
        //Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.println("введите второе число");
        int num2 = scan.nextInt();
        //Сравнить 2 числа и вывести большее на экран
        double num3 = num2;
        int result = Double.compare(num1, num3);
        if (result == 0)
            System.out.println("Значения равны");
        else if (result == 1)
            System.out.println("Большее число " + num1);
        else
            System.out.println("Большее число " + num3);
        //Выведите также меньшее число на экран, предварительно переконвертировать его в тип double
        double result2 = Math.min(num1, num3);
        if (num1 != num3)
            System.out.println("Меньшее число " + result2);
    }
}
